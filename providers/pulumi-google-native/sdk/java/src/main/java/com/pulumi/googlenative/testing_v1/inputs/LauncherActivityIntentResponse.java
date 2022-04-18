// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import java.util.Objects;


/**
 * Specifies an intent that starts the main launcher activity.
 * 
 */
public final class LauncherActivityIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final LauncherActivityIntentResponse Empty = new LauncherActivityIntentResponse();

    public LauncherActivityIntentResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LauncherActivityIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(LauncherActivityIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public LauncherActivityIntentResponse build() {
            return new LauncherActivityIntentResponse();
        }
    }
}
