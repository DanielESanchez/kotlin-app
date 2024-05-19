package  com.myneflow.davisi.ui.project.component

import android.widget.ProgressBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.rememberImagePainter
import com.myneflow.davisi.R

@Composable
fun TitleCard() {
    val url = "https://www.undp.org/sites/g/files/zskgke326/files/2023-09/playas.jpg"
    Card(
        modifier = Modifier
            .height(270.dp)
            .padding(start = 16.dp, end = 16.dp,)
            .background(Color.Transparent),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
        ) {
            Image(
                painter = rememberImagePainter(data = url),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Universidad Tecnologica UTEC",
                modifier = Modifier.padding(2.dp),
                style = TextStyle(fontSize = 12.sp),
                color = Color.Gray
            )
            Text(
                text = "\"Proyecto universitario para causa social\"",
                modifier = Modifier.padding(2.dp),
                style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold),
                color = Color.Black
            )
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.icon_people),
                    contentDescription = ""
                )
                Text(
                    text = "1.5k colaboradores",
                    modifier = Modifier.padding(2.dp),
                    style = TextStyle(fontSize = 12.sp),
                    color = Color.Gray
                )
                Icon(
                    painter = painterResource(id = R.drawable.icon_goal),
                    contentDescription = "",
                    modifier = Modifier.height(16.dp).width(16.dp).padding(start = 4.dp)
                )
                AndroidView(
                    factory = { context ->
                        ProgressBar(
                            context,
                            null,
                            android.R.attr.progressBarStyleHorizontal
                        ).apply {
                            progress = (0.7f * 100).toInt()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                )
            }
        }
    }
}