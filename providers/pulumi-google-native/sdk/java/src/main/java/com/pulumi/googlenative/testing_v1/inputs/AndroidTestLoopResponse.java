// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AppBundleResponse;
import com.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A test of an Android Application with a Test Loop. The intent \ will be implicitly added, since Games is the only user of this api, for the time being.
 * 
 */
public final class AndroidTestLoopResponse extends com.pulumi.resources.InvokeArgs {

    public static final AndroidTestLoopResponse Empty = new AndroidTestLoopResponse();

    /**
     * The APK for the application under test.
     * 
     */
    @Import(name="appApk", required=true)
    private FileReferenceResponse appApk;

    public FileReferenceResponse appApk() {
        return this.appApk;
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @Import(name="appBundle", required=true)
    private AppBundleResponse appBundle;

    public AppBundleResponse appBundle() {
        return this.appBundle;
    }

    /**
     * The java package for the application under test. The default is determined by examining the application&#39;s manifest.
     * 
     */
    @Import(name="appPackageId", required=true)
    private String appPackageId;

    public String appPackageId() {
        return this.appPackageId;
    }

    /**
     * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application&#39;s manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
     */
    @Import(name="scenarioLabels", required=true)
    private List<String> scenarioLabels;

    public List<String> scenarioLabels() {
        return this.scenarioLabels;
    }

    /**
     * The list of scenarios that should be run during the test. The default is all test loops, derived from the application&#39;s manifest.
     * 
     */
    @Import(name="scenarios", required=true)
    private List<Integer> scenarios;

    public List<Integer> scenarios() {
        return this.scenarios;
    }

    private AndroidTestLoopResponse() {}

    private AndroidTestLoopResponse(AndroidTestLoopResponse $) {
        this.appApk = $.appApk;
        this.appBundle = $.appBundle;
        this.appPackageId = $.appPackageId;
        this.scenarioLabels = $.scenarioLabels;
        this.scenarios = $.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidTestLoopResponse $;

        public Builder() {
            $ = new AndroidTestLoopResponse();
        }

        public Builder(AndroidTestLoopResponse defaults) {
            $ = new AndroidTestLoopResponse(Objects.requireNonNull(defaults));
        }

        public Builder appApk(FileReferenceResponse appApk) {
            $.appApk = appApk;
            return this;
        }

        public Builder appBundle(AppBundleResponse appBundle) {
            $.appBundle = appBundle;
            return this;
        }

        public Builder appPackageId(String appPackageId) {
            $.appPackageId = appPackageId;
            return this;
        }

        public Builder scenarioLabels(List<String> scenarioLabels) {
            $.scenarioLabels = scenarioLabels;
            return this;
        }

        public Builder scenarioLabels(String... scenarioLabels) {
            return scenarioLabels(List.of(scenarioLabels));
        }

        public Builder scenarios(List<Integer> scenarios) {
            $.scenarios = scenarios;
            return this;
        }

        public Builder scenarios(Integer... scenarios) {
            return scenarios(List.of(scenarios));
        }

        public AndroidTestLoopResponse build() {
            $.appApk = Objects.requireNonNull($.appApk, "expected parameter 'appApk' to be non-null");
            $.appBundle = Objects.requireNonNull($.appBundle, "expected parameter 'appBundle' to be non-null");
            $.appPackageId = Objects.requireNonNull($.appPackageId, "expected parameter 'appPackageId' to be non-null");
            $.scenarioLabels = Objects.requireNonNull($.scenarioLabels, "expected parameter 'scenarioLabels' to be non-null");
            $.scenarios = Objects.requireNonNull($.scenarios, "expected parameter 'scenarios' to be non-null");
            return $;
        }
    }

}
