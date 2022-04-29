// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AzureStaticWebAppsRegistrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Azure Static Web Apps provider.
 * 
 */
public final class AzureStaticWebAppsArgs extends ResourceArgs {

    public static final AzureStaticWebAppsArgs Empty = new AzureStaticWebAppsArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The configuration settings of the Azure Static Web Apps registration.
     * 
     */
    @Import(name="registration")
    private @Nullable Output<AzureStaticWebAppsRegistrationArgs> registration;

    /**
     * @return The configuration settings of the Azure Static Web Apps registration.
     * 
     */
    public Optional<Output<AzureStaticWebAppsRegistrationArgs>> registration() {
        return Optional.ofNullable(this.registration);
    }

    private AzureStaticWebAppsArgs() {}

    private AzureStaticWebAppsArgs(AzureStaticWebAppsArgs $) {
        this.enabled = $.enabled;
        this.registration = $.registration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureStaticWebAppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureStaticWebAppsArgs $;

        public Builder() {
            $ = new AzureStaticWebAppsArgs();
        }

        public Builder(AzureStaticWebAppsArgs defaults) {
            $ = new AzureStaticWebAppsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param registration The configuration settings of the Azure Static Web Apps registration.
         * 
         * @return builder
         * 
         */
        public Builder registration(@Nullable Output<AzureStaticWebAppsRegistrationArgs> registration) {
            $.registration = registration;
            return this;
        }

        /**
         * @param registration The configuration settings of the Azure Static Web Apps registration.
         * 
         * @return builder
         * 
         */
        public Builder registration(AzureStaticWebAppsRegistrationArgs registration) {
            return registration(Output.of(registration));
        }

        public AzureStaticWebAppsArgs build() {
            return $;
        }
    }

}
