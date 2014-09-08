#!/bin/sh

# Installs IntelliJ configs into the user configs. (based on Square's java code style settings: https://github.com/square/java-code-styles)

echo "Installing AppFoundry code style configs..."

for i in $HOME/Library/Preferences/IntelliJIdea*/codestyles \
         $HOME/Library/Preferences/IdeaIC*/codestyles \
         $HOME/Library/Preferences/AndroidStudio*/codestyles \
         $HOME/.IntelliJIdea*/config/codestyles \
         $HOME/.IdeaIC*/config/codestyles \
         $HOME/.AndroidStudio*/config/codestyles
do
  cp -frv $( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )/intellij/* $i 2> /dev/null
done

echo "Done."
echo ""
echo "Restart AndroidStudio and/or IntelliJ, go to preferences, and apply 'AppFoundryAndroidStyle'."