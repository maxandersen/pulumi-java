// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.TwitterRegistrationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TwitterResponse {
    /**
     * &lt;code&gt;false&lt;/code&gt; if the Twitter provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the app registration for the Twitter provider.
     * 
     */
    private final @Nullable TwitterRegistrationResponse registration;

    @CustomType.Constructor
    private TwitterResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("registration") @Nullable TwitterRegistrationResponse registration) {
        this.enabled = enabled;
        this.registration = registration;
    }

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Twitter provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the app registration for the Twitter provider.
     * 
    */
    public Optional<TwitterRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable TwitterRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(TwitterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder registration(@Nullable TwitterRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }        public TwitterResponse build() {
            return new TwitterResponse(enabled, registration);
        }
    }
}
