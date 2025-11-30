# Activity 7 : Reflection

<strong>What did you learn about using fragments and navigation components?</strong>
<p>
  I learned that Navigation Components simplify fragment management through visual navigation graphs that handle back stacks automatically.
  The seamless integration between BottomNavigationView and NavController makes tab-based navigation efficient and reliable.
  Using Safe Args also provides type-safe parameter passing between destinations, reducing potential errors.
</p>

<strong>How did you make your UI adaptive to screen size or orientation?</strong>
<p>
  I used ConstraintLayout for flexible, responsive designs that adapt to different screen sizes through constraints and percentage-based sizing.
  For larger screens, I created specialized layouts in the layout-sw600dp folder featuring optimized navigation and content arrangements.
  I also implemented weight-based layouts and proper dimension resources to ensure consistent appearance across orientations.
</p>

<strong>What challenges did you face when combining Bottom Navigation and Tabs?</strong>
<p>
  Managing nested navigation hierarchies and back stack behavior between the two systems proved complex. 
  Preserving tab state when switching between bottom navigation items required careful lifecycle management and state handling. 
  Designing an intuitive user experience with multiple navigation levels needed thoughtful planning to prevent user confusion.
</p>
