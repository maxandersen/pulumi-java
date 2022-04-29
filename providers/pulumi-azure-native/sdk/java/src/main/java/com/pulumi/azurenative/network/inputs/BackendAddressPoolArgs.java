// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.LoadBalancerBackendAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pool of backend IP addresses.
 * 
 */
public final class BackendAddressPoolArgs extends ResourceArgs {

    public static final BackendAddressPoolArgs Empty = new BackendAddressPoolArgs();

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
     * An array of backend addresses.
     * 
     */
    @Import(name="loadBalancerBackendAddresses")
    private @Nullable Output<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses;

    /**
     * @return An array of backend addresses.
     * 
     */
    public Optional<Output<List<LoadBalancerBackendAddressArgs>>> loadBalancerBackendAddresses() {
        return Optional.ofNullable(this.loadBalancerBackendAddresses);
    }

    /**
     * The location of the backend address pool.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the backend address pool.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BackendAddressPoolArgs() {}

    private BackendAddressPoolArgs(BackendAddressPoolArgs $) {
        this.id = $.id;
        this.loadBalancerBackendAddresses = $.loadBalancerBackendAddresses;
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendAddressPoolArgs $;

        public Builder() {
            $ = new BackendAddressPoolArgs();
        }

        public Builder(BackendAddressPoolArgs defaults) {
            $ = new BackendAddressPoolArgs(Objects.requireNonNull(defaults));
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
         * @param loadBalancerBackendAddresses An array of backend addresses.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddresses(@Nullable Output<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses) {
            $.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
            return this;
        }

        /**
         * @param loadBalancerBackendAddresses An array of backend addresses.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddresses(List<LoadBalancerBackendAddressArgs> loadBalancerBackendAddresses) {
            return loadBalancerBackendAddresses(Output.of(loadBalancerBackendAddresses));
        }

        /**
         * @param loadBalancerBackendAddresses An array of backend addresses.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddresses(LoadBalancerBackendAddressArgs... loadBalancerBackendAddresses) {
            return loadBalancerBackendAddresses(List.of(loadBalancerBackendAddresses));
        }

        /**
         * @param location The location of the backend address pool.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the backend address pool.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BackendAddressPoolArgs build() {
            return $;
        }
    }

}
