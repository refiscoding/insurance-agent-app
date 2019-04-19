package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.Models.Todo;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;
import ke.co.insuranceapp.ViewHolders.TodoViewHolder;

public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {

    Context ctx;
    ArrayList<Todo> todos;

    public TodoAdapter(Context ctx, ArrayList<Todo> todos) {
        this.ctx = ctx;
        this.todos = todos;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item, parent, false);
        return new TodoViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        Todo todo = todos.get(position);
        holder.titleTv.setText(todo.getTitle());
        holder.detailTv.setText(todo.getDetail());
        holder.dateTv.setText(todo.getDate());
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }
}
