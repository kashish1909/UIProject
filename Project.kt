import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
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


@Composable
fun title()
{
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.White),
        horizontalArrangement = Arrangement.Center) {
        Text(text = "Superheroes",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight=FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun Section1()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Nick the night and day",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "The Jetpack hero",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero1), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section2()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Reality Protector",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Understands the absolute truth",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero2), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section3()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Andre the Gaint",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Mimics the light and night to blend in",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero3), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section4()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Benjamin the Brave",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Harnesses the power of canary to develop\nbravely",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero4), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section5()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Magnifient Maru",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Effortlessly glides in to save the day",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero5), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@Composable
fun Section6()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFC5C8B9))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Dynamic Yasmine",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight=FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Text(
                text = "Ability to shift to any form and energize",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default
            )
        }
        Image(
            imageVector = ImageVector.vectorResource(id =com.example.myapplication.R.drawable.android_superhero6), contentDescription =null,
            modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp)))
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllSection()
{
    Scaffold(
        topBar = {
            TopAppBar(title ={ title()}

            )
        },
        containerColor = Color(0xFFFEFCF5)
    ) {it
        Column(modifier = Modifier
            .padding(it)
            .padding(18.dp)
            .verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(5.dp))
            Section1()
            Spacer(modifier = Modifier.height(20.dp))
            Section2()
            Spacer(modifier = Modifier.height(20.dp))
            Section3()
            Spacer(modifier = Modifier.height(20.dp))
            Section4()
            Spacer(modifier = Modifier.height(20.dp))
            Section5()
            Spacer(modifier = Modifier.height(20.dp))
            Section6()


        }

    }

}

@Preview(showBackground = true)
@Composable
fun ProjectPreview()
{
//    Section6()
    AllSection()
}