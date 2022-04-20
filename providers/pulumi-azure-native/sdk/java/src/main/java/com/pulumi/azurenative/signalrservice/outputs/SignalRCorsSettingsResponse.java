// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SignalRCorsSettingsResponse {
    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin calls (for example: http://example.com:12345). Use &#34;*&#34; to allow all. If omitted, allow all by default.
     * 
     */
    private final @Nullable List<String> allowedOrigins;

    @CustomType.Constructor
    private SignalRCorsSettingsResponse(@CustomType.Parameter("allowedOrigins") @Nullable List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin calls (for example: http://example.com:12345). Use &#34;*&#34; to allow all. If omitted, allow all by default.
     * 
    */
    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRCorsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRCorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
        }

        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }        public SignalRCorsSettingsResponse build() {
            return new SignalRCorsSettingsResponse(allowedOrigins);
        }
    }
}
