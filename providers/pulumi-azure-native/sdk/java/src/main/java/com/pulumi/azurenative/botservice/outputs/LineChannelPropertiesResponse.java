// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.azurenative.botservice.outputs.LineRegistrationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LineChannelPropertiesResponse {
    /**
     * @return Callback Url to enter in line registration.
     * 
     */
    private final String callbackUrl;
    /**
     * @return Whether this channel is validated for the bot
     * 
     */
    private final Boolean isValidated;
    /**
     * @return The list of line channel registrations
     * 
     */
    private final List<LineRegistrationResponse> lineRegistrations;

    @CustomType.Constructor
    private LineChannelPropertiesResponse(
        @CustomType.Parameter("callbackUrl") String callbackUrl,
        @CustomType.Parameter("isValidated") Boolean isValidated,
        @CustomType.Parameter("lineRegistrations") List<LineRegistrationResponse> lineRegistrations) {
        this.callbackUrl = callbackUrl;
        this.isValidated = isValidated;
        this.lineRegistrations = lineRegistrations;
    }

    /**
     * @return Callback Url to enter in line registration.
     * 
     */
    public String callbackUrl() {
        return this.callbackUrl;
    }
    /**
     * @return Whether this channel is validated for the bot
     * 
     */
    public Boolean isValidated() {
        return this.isValidated;
    }
    /**
     * @return The list of line channel registrations
     * 
     */
    public List<LineRegistrationResponse> lineRegistrations() {
        return this.lineRegistrations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private Boolean isValidated;
        private List<LineRegistrationResponse> lineRegistrations;

        public Builder() {
    	      // Empty
        }

        public Builder(LineChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.isValidated = defaults.isValidated;
    	      this.lineRegistrations = defaults.lineRegistrations;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }
        public Builder isValidated(Boolean isValidated) {
            this.isValidated = Objects.requireNonNull(isValidated);
            return this;
        }
        public Builder lineRegistrations(List<LineRegistrationResponse> lineRegistrations) {
            this.lineRegistrations = Objects.requireNonNull(lineRegistrations);
            return this;
        }
        public Builder lineRegistrations(LineRegistrationResponse... lineRegistrations) {
            return lineRegistrations(List.of(lineRegistrations));
        }        public LineChannelPropertiesResponse build() {
            return new LineChannelPropertiesResponse(callbackUrl, isValidated, lineRegistrations);
        }
    }
}
