package gkk.app.android.blockloper.ui.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun DrawerButton(
    label: String,
    icon: ImageVector,
    isSelected: Boolean,
    action: () -> Unit,
) {
    val colors = MaterialTheme.colors
    val textIconColor = if (isSelected) colors.primary else colors.onSurface.copy(alpha = 0.6f)
    val bgColor = if (isSelected) colors.primary.copy(alpha = 0.12f) else Color.Transparent

    Surface(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        color = bgColor
    ) {
        TextButton(onClick = action, Modifier.fillMaxWidth()) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                NavigationIcon(
                    icon = icon,
                    isSelected = isSelected,
                    contentDescription = null,
                    tintColor = textIconColor,
                    modifier = Modifier.width(30.dp).height(30.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = label,
                    style = MaterialTheme.typography.body2,
                    color = textIconColor
                )
            }
        }
    }
}