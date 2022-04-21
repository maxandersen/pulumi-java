// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidTestResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.IosTestResponse;
import java.util.Objects;


/**
 * The details about how to run the execution.
 * 
 */
public final class SpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final SpecificationResponse Empty = new SpecificationResponse();

    /**
     * An Android mobile test execution specification.
     * 
     */
    @Import(name="androidTest", required=true)
    private AndroidTestResponse androidTest;

    public AndroidTestResponse androidTest() {
        return this.androidTest;
    }

    /**
     * An iOS mobile test execution specification.
     * 
     */
    @Import(name="iosTest", required=true)
    private IosTestResponse iosTest;

    public IosTestResponse iosTest() {
        return this.iosTest;
    }

    private SpecificationResponse() {}

    private SpecificationResponse(SpecificationResponse $) {
        this.androidTest = $.androidTest;
        this.iosTest = $.iosTest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpecificationResponse $;

        public Builder() {
            $ = new SpecificationResponse();
        }

        public Builder(SpecificationResponse defaults) {
            $ = new SpecificationResponse(Objects.requireNonNull(defaults));
        }

        public Builder androidTest(AndroidTestResponse androidTest) {
            $.androidTest = androidTest;
            return this;
        }

        public Builder iosTest(IosTestResponse iosTest) {
            $.iosTest = iosTest;
            return this;
        }

        public SpecificationResponse build() {
            $.androidTest = Objects.requireNonNull($.androidTest, "expected parameter 'androidTest' to be non-null");
            $.iosTest = Objects.requireNonNull($.iosTest, "expected parameter 'iosTest' to be non-null");
            return $;
        }
    }

}
