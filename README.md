# CustomView
#自定义控件 圆角ImageView 变色的加载圆形进度。 支持双击TextView，im的聊天的左右尖角ImageView
 # 1 圆角ImageView
 #       <com.customview.ShapeImageView
 #       android:layout_width="wrap_content"
 #       android:layout_height="wrap_content"
 #       android:src="@mipmap/sssss"/>
 #         
 # 2变色的加载圆形进度
 #    <com.customview.CircularProgress
 #      android:layout_width="30dp"
 #      android:layout_height="30dp" />
 # 3 双击TextView 
 # #注意实现点击onClick双击事件才生效
 # 
 # <com.customview.TextDoubleView
 #       app:is_left="false"
 #       android:text="这个是双击TextView"
 #       android:id="@+id/textDoubleView"
 #       android:layout_width="wrap_content"
 #       android:layout_height="wrap_content" />
 #  5 im尖角ImageView
 # <com.customview.ChatImageView
 #       android:layout_width="wrap_content"
 #       android:layout_height="wrap_content"
 #       android:src="@mipmap/aaaa"
 #       app:bubble_angle="10dp"
 #       app:bubble_arrowHeight="15dp"
 #       app:bubble_arrowLocation="left"
 #       app:bubble_arrowOffset="3dp"
 #       app:bubble_arrowTop="20dp"
 #       app:bubble_arrowWidth="8dp"/>
 # bubble_angle  圆角弧度
 # bubble_arrowHeight 突出尖角高度
 # bubble_arrowLocation 尖角是否左右  left  right
 # bubble_arrowOffset   尖角向上倾角度
 # bubble_arrowTop  设置尖角到控件top距离
 # bubble_arrowWidth  突出尖角宽度
  
