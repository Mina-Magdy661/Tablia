package iti.team.tablia.CustomerAccount.Home.seeAll;

//public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
//    Context context;
//    List<Integer> arrName;
//
//    public CategoryAdapter(Context context, List<Integer> arrName) {
//        this.context = context;
//        this.arrName = arrName;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.category_item_row, viewGroup, false));
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.image.setImageResource(arrName.get(position));
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "hey ", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return arrName.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder  {
//
//        CircleImageView image;
//
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            image = itemView.findViewById(R.id.id_profile_pic);
//
//        }
//    }
//}