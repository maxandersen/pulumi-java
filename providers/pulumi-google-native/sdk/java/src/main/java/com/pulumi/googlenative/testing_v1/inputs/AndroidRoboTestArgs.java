// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.enums.AndroidRoboTestRoboMode;
import com.pulumi.googlenative.testing_v1.inputs.AppBundleArgs;
import com.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import com.pulumi.googlenative.testing_v1.inputs.RoboDirectiveArgs;
import com.pulumi.googlenative.testing_v1.inputs.RoboStartingIntentArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A test of an android application that explores the application on a virtual or physical Android Device, finding culprits and crashes as it goes.
 * 
 */
public final class AndroidRoboTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidRoboTestArgs Empty = new AndroidRoboTestArgs();

    /**
     * The APK for the application under test.
     * 
     */
    @Import(name="appApk")
    private @Nullable Output<FileReferenceArgs> appApk;

    /**
     * @return The APK for the application under test.
     * 
     */
    public Optional<Output<FileReferenceArgs>> appApk() {
        return Optional.ofNullable(this.appApk);
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @Import(name="appBundle")
    private @Nullable Output<AppBundleArgs> appBundle;

    /**
     * @return A multi-apk app bundle for the application under test.
     * 
     */
    public Optional<Output<AppBundleArgs>> appBundle() {
        return Optional.ofNullable(this.appBundle);
    }

    /**
     * The initial activity that should be used to start the app.
     * 
     */
    @Import(name="appInitialActivity")
    private @Nullable Output<String> appInitialActivity;

    /**
     * @return The initial activity that should be used to start the app.
     * 
     */
    public Optional<Output<String>> appInitialActivity() {
        return Optional.ofNullable(this.appInitialActivity);
    }

    /**
     * The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    @Import(name="appPackageId")
    private @Nullable Output<String> appPackageId;

    /**
     * @return The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    public Optional<Output<String>> appPackageId() {
        return Optional.ofNullable(this.appPackageId);
    }

    /**
     * The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50.
     * 
     */
    @Import(name="maxDepth")
    private @Nullable Output<Integer> maxDepth;

    /**
     * @return The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50.
     * 
     */
    public Optional<Output<Integer>> maxDepth() {
        return Optional.ofNullable(this.maxDepth);
    }

    /**
     * The max number of steps Robo can execute. Default is no limit.
     * 
     */
    @Import(name="maxSteps")
    private @Nullable Output<Integer> maxSteps;

    /**
     * @return The max number of steps Robo can execute. Default is no limit.
     * 
     */
    public Optional<Output<Integer>> maxSteps() {
        return Optional.ofNullable(this.maxSteps);
    }

    /**
     * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
     */
    @Import(name="roboDirectives")
    private @Nullable Output<List<RoboDirectiveArgs>> roboDirectives;

    /**
     * @return A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
     */
    public Optional<Output<List<RoboDirectiveArgs>>> roboDirectives() {
        return Optional.ofNullable(this.roboDirectives);
    }

    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    @Import(name="roboMode")
    private @Nullable Output<AndroidRoboTestRoboMode> roboMode;

    /**
     * @return The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    public Optional<Output<AndroidRoboTestRoboMode>> roboMode() {
        return Optional.ofNullable(this.roboMode);
    }

    /**
     * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
     */
    @Import(name="roboScript")
    private @Nullable Output<FileReferenceArgs> roboScript;

    /**
     * @return A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
     */
    public Optional<Output<FileReferenceArgs>> roboScript() {
        return Optional.ofNullable(this.roboScript);
    }

    /**
     * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
     */
    @Import(name="startingIntents")
    private @Nullable Output<List<RoboStartingIntentArgs>> startingIntents;

    /**
     * @return The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
     */
    public Optional<Output<List<RoboStartingIntentArgs>>> startingIntents() {
        return Optional.ofNullable(this.startingIntents);
    }

    private AndroidRoboTestArgs() {}

    private AndroidRoboTestArgs(AndroidRoboTestArgs $) {
        this.appApk = $.appApk;
        this.appBundle = $.appBundle;
        this.appInitialActivity = $.appInitialActivity;
        this.appPackageId = $.appPackageId;
        this.maxDepth = $.maxDepth;
        this.maxSteps = $.maxSteps;
        this.roboDirectives = $.roboDirectives;
        this.roboMode = $.roboMode;
        this.roboScript = $.roboScript;
        this.startingIntents = $.startingIntents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidRoboTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidRoboTestArgs $;

        public Builder() {
            $ = new AndroidRoboTestArgs();
        }

        public Builder(AndroidRoboTestArgs defaults) {
            $ = new AndroidRoboTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appApk The APK for the application under test.
         * 
         * @return builder
         * 
         */
        public Builder appApk(@Nullable Output<FileReferenceArgs> appApk) {
            $.appApk = appApk;
            return this;
        }

        /**
         * @param appApk The APK for the application under test.
         * 
         * @return builder
         * 
         */
        public Builder appApk(FileReferenceArgs appApk) {
            return appApk(Output.of(appApk));
        }

        /**
         * @param appBundle A multi-apk app bundle for the application under test.
         * 
         * @return builder
         * 
         */
        public Builder appBundle(@Nullable Output<AppBundleArgs> appBundle) {
            $.appBundle = appBundle;
            return this;
        }

        /**
         * @param appBundle A multi-apk app bundle for the application under test.
         * 
         * @return builder
         * 
         */
        public Builder appBundle(AppBundleArgs appBundle) {
            return appBundle(Output.of(appBundle));
        }

        /**
         * @param appInitialActivity The initial activity that should be used to start the app.
         * 
         * @return builder
         * 
         */
        public Builder appInitialActivity(@Nullable Output<String> appInitialActivity) {
            $.appInitialActivity = appInitialActivity;
            return this;
        }

        /**
         * @param appInitialActivity The initial activity that should be used to start the app.
         * 
         * @return builder
         * 
         */
        public Builder appInitialActivity(String appInitialActivity) {
            return appInitialActivity(Output.of(appInitialActivity));
        }

        /**
         * @param appPackageId The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
         * 
         * @return builder
         * 
         */
        public Builder appPackageId(@Nullable Output<String> appPackageId) {
            $.appPackageId = appPackageId;
            return this;
        }

        /**
         * @param appPackageId The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
         * 
         * @return builder
         * 
         */
        public Builder appPackageId(String appPackageId) {
            return appPackageId(Output.of(appPackageId));
        }

        /**
         * @param maxDepth The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50.
         * 
         * @return builder
         * 
         */
        public Builder maxDepth(@Nullable Output<Integer> maxDepth) {
            $.maxDepth = maxDepth;
            return this;
        }

        /**
         * @param maxDepth The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50.
         * 
         * @return builder
         * 
         */
        public Builder maxDepth(Integer maxDepth) {
            return maxDepth(Output.of(maxDepth));
        }

        /**
         * @param maxSteps The max number of steps Robo can execute. Default is no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxSteps(@Nullable Output<Integer> maxSteps) {
            $.maxSteps = maxSteps;
            return this;
        }

        /**
         * @param maxSteps The max number of steps Robo can execute. Default is no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxSteps(Integer maxSteps) {
            return maxSteps(Output.of(maxSteps));
        }

        /**
         * @param roboDirectives A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
         * 
         * @return builder
         * 
         */
        public Builder roboDirectives(@Nullable Output<List<RoboDirectiveArgs>> roboDirectives) {
            $.roboDirectives = roboDirectives;
            return this;
        }

        /**
         * @param roboDirectives A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
         * 
         * @return builder
         * 
         */
        public Builder roboDirectives(List<RoboDirectiveArgs> roboDirectives) {
            return roboDirectives(Output.of(roboDirectives));
        }

        /**
         * @param roboDirectives A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
         * 
         * @return builder
         * 
         */
        public Builder roboDirectives(RoboDirectiveArgs... roboDirectives) {
            return roboDirectives(List.of(roboDirectives));
        }

        /**
         * @param roboMode The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
         * 
         * @return builder
         * 
         */
        public Builder roboMode(@Nullable Output<AndroidRoboTestRoboMode> roboMode) {
            $.roboMode = roboMode;
            return this;
        }

        /**
         * @param roboMode The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
         * 
         * @return builder
         * 
         */
        public Builder roboMode(AndroidRoboTestRoboMode roboMode) {
            return roboMode(Output.of(roboMode));
        }

        /**
         * @param roboScript A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
         * 
         * @return builder
         * 
         */
        public Builder roboScript(@Nullable Output<FileReferenceArgs> roboScript) {
            $.roboScript = roboScript;
            return this;
        }

        /**
         * @param roboScript A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
         * 
         * @return builder
         * 
         */
        public Builder roboScript(FileReferenceArgs roboScript) {
            return roboScript(Output.of(roboScript));
        }

        /**
         * @param startingIntents The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
         * 
         * @return builder
         * 
         */
        public Builder startingIntents(@Nullable Output<List<RoboStartingIntentArgs>> startingIntents) {
            $.startingIntents = startingIntents;
            return this;
        }

        /**
         * @param startingIntents The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
         * 
         * @return builder
         * 
         */
        public Builder startingIntents(List<RoboStartingIntentArgs> startingIntents) {
            return startingIntents(Output.of(startingIntents));
        }

        /**
         * @param startingIntents The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
         * 
         * @return builder
         * 
         */
        public Builder startingIntents(RoboStartingIntentArgs... startingIntents) {
            return startingIntents(List.of(startingIntents));
        }

        public AndroidRoboTestArgs build() {
            return $;
        }
    }

}
