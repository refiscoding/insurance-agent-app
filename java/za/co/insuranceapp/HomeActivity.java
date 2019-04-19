package ke.co.insuranceapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ke.co.insuranceapp.Fragments.AppointmentFragment;
import ke.co.insuranceapp.Fragments.ClaimFragment;
import ke.co.insuranceapp.Fragments.CustomerFragment;
import ke.co.insuranceapp.Fragments.HomeFragment;
import ke.co.insuranceapp.Fragments.LeadsFragment;
import ke.co.insuranceapp.Fragments.MotorCertificatesFragment;
import ke.co.insuranceapp.Fragments.PolicyFragment;
import ke.co.insuranceapp.Fragments.QuotationsFragment;
import ke.co.insuranceapp.Fragments.RenewalFragment;
import ke.co.insuranceapp.Fragments.TodoFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

//    SharedPreference sharedPreference;
//    TextView usernameTv, emailTv;
//    ImageView profileImage;



    public static int navItemIndex = 0;
    String title = "Home";
    private int backCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        sharedPreference = new SharedPreference(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        View header = navigationView.getHeaderView(0);

//        profileImage = header.findViewById(R.id.imageView);
//        usernameTv = header.findViewById(R.id.profileUsernameTV);
//        emailTv = header.findViewById(R.id.profileEmailTV);

        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawers();
            }
        });

        navItemIndex = 0;

        setFragment(HomeFragment.getInstance(),"InsuranceApp");
//        initProfile();
//
//        if (!isLoggedIn()){
//            startActivity(LoginActivity.getIntent(this));
//            finish();
//        }
    }


//    private void initProfile() {
//        User me = sharedPreference.getUser();
//        if (me.getLname().trim().isEmpty()){
//            return;
//        }
//
//        usernameTv.setText(String.format("%s %s", me.getFname(), me.getLname()));
//        emailTv.setText(me.getEmail());
//    }

//    public boolean isLoggedIn(){
//        if (Boolean.valueOf(sharedPreference.getValue(SharedPreference.isLoggedIn))){ return  true; }
//        return false;
//    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }


        if (navItemIndex == 0) { // If in first page exit app
            if(backCounter == 0){
                backCounter++;
                Toast.makeText(this, "You are on the home screen. Press back again to exit the application", Toast.LENGTH_LONG).show();
            } else{
                finish();
            }
        } else {  // Move to first page
            navItemIndex = 0;
            setFragment(HomeFragment.getInstance(), "Insurance App");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        Fragment fragment = null;

        if (id == R.id.nav_renewals) {
            navItemIndex = 1;
            fragment = RenewalFragment.getInstance();
            title = "Renewals";
        } else if (id == R.id.nav_appointments) {
            navItemIndex = 2;
            fragment = AppointmentFragment.getInstance();
            title = "Appointments";
        } else if (id == R.id.nav_todolist) {
            navItemIndex = 3;
            fragment = TodoFragment.getInstance();
            title = "To do list";
        } else if (id == R.id.nav_leads) {
            navItemIndex = 4;
            fragment = LeadsFragment.getInstance();
            title = "Leads";
        } else if (id == R.id.nav_customers) {
            navItemIndex = 5;
            fragment = CustomerFragment .getInstance();
            title = "Customer";
        } else if (id == R.id.nav_quotations) {
            navItemIndex = 6;
            fragment = QuotationsFragment.getInstance();
            title = "Quotations";
        } else if (id == R.id.nav_policies) {
            navItemIndex = 7;
            fragment = PolicyFragment.getInstance();
            title = "Policies";
        } else if (id == R.id.nav_claims) {
            navItemIndex = 8;
            fragment = ClaimFragment.getInstance();
            title = "Claim";
        } else if (id == R.id.nav_certificates) {
            navItemIndex = 9;
            fragment = MotorCertificatesFragment.getInstance();
            title = "Motor Certificates";
        } else if (id == R.id.nav_reports) {
            navItemIndex = 10;
            fragment = ReportsFragment.getInstance();
            title = "Reports";
        }

        if (fragment != null)  setFragment(fragment, title);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void setFragment(Fragment fragment, String title){
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.placeholder, fragment).addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
        setTitle(title);
    }

}
