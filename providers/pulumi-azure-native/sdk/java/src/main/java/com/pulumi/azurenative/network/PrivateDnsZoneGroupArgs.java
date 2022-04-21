// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.PrivateDnsZoneConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateDnsZoneGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateDnsZoneGroupArgs Empty = new PrivateDnsZoneGroupArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A collection of private dns zone configurations of the private dns zone group.
     * 
     */
    @Import(name="privateDnsZoneConfigs")
    private @Nullable Output<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs;

    public Optional<Output<List<PrivateDnsZoneConfigArgs>>> privateDnsZoneConfigs() {
        return Optional.ofNullable(this.privateDnsZoneConfigs);
    }

    /**
     * The name of the private dns zone group.
     * 
     */
    @Import(name="privateDnsZoneGroupName")
    private @Nullable Output<String> privateDnsZoneGroupName;

    public Optional<Output<String>> privateDnsZoneGroupName() {
        return Optional.ofNullable(this.privateDnsZoneGroupName);
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName", required=true)
    private Output<String> privateEndpointName;

    public Output<String> privateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PrivateDnsZoneGroupArgs() {}

    private PrivateDnsZoneGroupArgs(PrivateDnsZoneGroupArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.privateDnsZoneConfigs = $.privateDnsZoneConfigs;
        this.privateDnsZoneGroupName = $.privateDnsZoneGroupName;
        this.privateEndpointName = $.privateEndpointName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateDnsZoneGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateDnsZoneGroupArgs $;

        public Builder() {
            $ = new PrivateDnsZoneGroupArgs();
        }

        public Builder(PrivateDnsZoneGroupArgs defaults) {
            $ = new PrivateDnsZoneGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privateDnsZoneConfigs(@Nullable Output<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs) {
            $.privateDnsZoneConfigs = privateDnsZoneConfigs;
            return this;
        }

        public Builder privateDnsZoneConfigs(List<PrivateDnsZoneConfigArgs> privateDnsZoneConfigs) {
            return privateDnsZoneConfigs(Output.of(privateDnsZoneConfigs));
        }

        public Builder privateDnsZoneConfigs(PrivateDnsZoneConfigArgs... privateDnsZoneConfigs) {
            return privateDnsZoneConfigs(List.of(privateDnsZoneConfigs));
        }

        public Builder privateDnsZoneGroupName(@Nullable Output<String> privateDnsZoneGroupName) {
            $.privateDnsZoneGroupName = privateDnsZoneGroupName;
            return this;
        }

        public Builder privateDnsZoneGroupName(String privateDnsZoneGroupName) {
            return privateDnsZoneGroupName(Output.of(privateDnsZoneGroupName));
        }

        public Builder privateEndpointName(Output<String> privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        public Builder privateEndpointName(String privateEndpointName) {
            return privateEndpointName(Output.of(privateEndpointName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public PrivateDnsZoneGroupArgs build() {
            $.privateEndpointName = Objects.requireNonNull($.privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
