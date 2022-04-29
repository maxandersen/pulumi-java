// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayPrivateLinkIpConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private Link Configuration on an application gateway.
 * 
 */
public final class ApplicationGatewayPrivateLinkConfigurationArgs extends ResourceArgs {

    public static final ApplicationGatewayPrivateLinkConfigurationArgs Empty = new ApplicationGatewayPrivateLinkConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An array of application gateway private link ip configurations.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations;

    /**
     * @return An array of application gateway private link ip configurations.
     * 
     */
    public Optional<Output<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * Name of the private link configuration that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the private link configuration that is unique within an Application Gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApplicationGatewayPrivateLinkConfigurationArgs() {}

    private ApplicationGatewayPrivateLinkConfigurationArgs(ApplicationGatewayPrivateLinkConfigurationArgs $) {
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayPrivateLinkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayPrivateLinkConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayPrivateLinkConfigurationArgs();
        }

        public Builder(ApplicationGatewayPrivateLinkConfigurationArgs defaults) {
            $ = new ApplicationGatewayPrivateLinkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipConfigurations An array of application gateway private link ip configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(@Nullable Output<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations An array of application gateway private link ip configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<ApplicationGatewayPrivateLinkIpConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations An array of application gateway private link ip configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(ApplicationGatewayPrivateLinkIpConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param name Name of the private link configuration that is unique within an Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the private link configuration that is unique within an Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplicationGatewayPrivateLinkConfigurationArgs build() {
            return $;
        }
    }

}
