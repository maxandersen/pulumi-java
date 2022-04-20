// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AzureStaticWebAppsRegistrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Azure Static Web Apps provider.
 * 
 */
public final class AzureStaticWebAppsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureStaticWebAppsArgs Empty = new AzureStaticWebAppsArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The configuration settings of the Azure Static Web Apps registration.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<AzureStaticWebAppsRegistrationArgs> registration;

    public Output<AzureStaticWebAppsRegistrationArgs> registration() {
        return this.registration == null ? Codegen.empty() : this.registration;
    }

    public AzureStaticWebAppsArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<AzureStaticWebAppsRegistrationArgs> registration) {
        this.enabled = enabled;
        this.registration = registration;
    }

    private AzureStaticWebAppsArgs() {
        this.enabled = Codegen.empty();
        this.registration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStaticWebAppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<AzureStaticWebAppsRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStaticWebAppsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder registration(@Nullable Output<AzureStaticWebAppsRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }
        public Builder registration(@Nullable AzureStaticWebAppsRegistrationArgs registration) {
            this.registration = Codegen.ofNullable(registration);
            return this;
        }        public AzureStaticWebAppsArgs build() {
            return new AzureStaticWebAppsArgs(enabled, registration);
        }
    }
}
