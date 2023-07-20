import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun title1()
{
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color(0xFF000000)),
        horizontalArrangement = Arrangement.Center) {
        Text(text = "Superheroes",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight= FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun Section11()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Nick the night and day",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "The Jetpack hero",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero1), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section22()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Reality Protector",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Understands the absolute truth",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero2), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section33()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Andre the Gaint",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Mimics the light and night to blend in",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero3), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section44()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Benjamin the Brave",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Harnesses the power of canary to develop\nbravely",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero4), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section55()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Magnifient Maru",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Effortlessly glides in to save the day",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero5), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section66()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFF45483D))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Dynamic Yasmine",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight= FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Ability to shift to any form and energize",
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.android_superhero6), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllSection1()
{
    Scaffold(
        topBar = {
            TopAppBar(title ={ title1()}, colors = TopAppBarDefaults.mediumTopAppBarColors(Color(0xFF000000))

            )
        },
        containerColor = Color(0xFF000000)
    ) {it
        Column(modifier = Modifier
            .padding(it)
            .padding(18.dp)
            .verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(5.dp))
            Section11()
            Spacer(modifier = Modifier.height(20.dp))
            Section22()
            Spacer(modifier = Modifier.height(20.dp))
            Section33()
            Spacer(modifier = Modifier.height(20.dp))
            Section44()
            Spacer(modifier = Modifier.height(20.dp))
            Section55()
            Spacer(modifier = Modifier.height(20.dp))
            Section66()
            Spacer(modifier = Modifier.height(5.dp))
            Section11()
            Spacer(modifier = Modifier.height(20.dp))
            Section22()
            Spacer(modifier = Modifier.height(20.dp))
            Section33()
            Spacer(modifier = Modifier.height(20.dp))
            Section44()
            Spacer(modifier = Modifier.height(20.dp))
            Section55()
            Spacer(modifier = Modifier.height(20.dp))
            Section66()


        }

    }

}

@Preview(showBackground = true)
@Composable
fun ProjectPreview1() {
//    Section6()
    AllSection1()
}