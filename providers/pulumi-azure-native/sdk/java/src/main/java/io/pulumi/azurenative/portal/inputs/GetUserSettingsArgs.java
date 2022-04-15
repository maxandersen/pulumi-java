// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserSettingsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserSettingsArgs Empty = new GetUserSettingsArgs();

    /**
     * The name of the user settings
     * 
     */
    @Import(name="userSettingsName", required=true)
      private final String userSettingsName;

    public String userSettingsName() {
        return this.userSettingsName;
    }

    public GetUserSettingsArgs(String userSettingsName) {
        this.userSettingsName = Objects.requireNonNull(userSettingsName, "expected parameter 'userSettingsName' to be non-null");
    }

    private GetUserSettingsArgs() {
        this.userSettingsName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userSettingsName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userSettingsName = defaults.userSettingsName;
        }

        public Builder userSettingsName(String userSettingsName) {
            this.userSettingsName = Objects.requireNonNull(userSettingsName);
            return this;
        }        public GetUserSettingsArgs build() {
            return new GetUserSettingsArgs(userSettingsName);
        }
    }
}
