// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the auto-registration of the Forwarding Rule to Service Directory. The region and project of the Service Directory resource generated from this registration will be the same as this Forwarding Rule.
 * 
 */
public final class ForwardingRuleServiceDirectoryRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleServiceDirectoryRegistrationArgs Empty = new ForwardingRuleServiceDirectoryRegistrationArgs();

    /**
     * Service Directory namespace to register the forwarding rule under.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * Service Directory service to register the forwarding rule under.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    @Import(name="serviceDirectoryRegion")
      private final @Nullable Output<String> serviceDirectoryRegion;

    public Output<String> serviceDirectoryRegion() {
        return this.serviceDirectoryRegion == null ? Codegen.empty() : this.serviceDirectoryRegion;
    }

    public ForwardingRuleServiceDirectoryRegistrationArgs(
        @Nullable Output<String> namespace,
        @Nullable Output<String> service,
        @Nullable Output<String> serviceDirectoryRegion) {
        this.namespace = namespace;
        this.service = service;
        this.serviceDirectoryRegion = serviceDirectoryRegion;
    }

    private ForwardingRuleServiceDirectoryRegistrationArgs() {
        this.namespace = Codegen.empty();
        this.service = Codegen.empty();
        this.serviceDirectoryRegion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleServiceDirectoryRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> service;
        private @Nullable Output<String> serviceDirectoryRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleServiceDirectoryRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.service = defaults.service;
    	      this.serviceDirectoryRegion = defaults.serviceDirectoryRegion;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder serviceDirectoryRegion(@Nullable Output<String> serviceDirectoryRegion) {
            this.serviceDirectoryRegion = serviceDirectoryRegion;
            return this;
        }
        public Builder serviceDirectoryRegion(@Nullable String serviceDirectoryRegion) {
            this.serviceDirectoryRegion = Codegen.ofNullable(serviceDirectoryRegion);
            return this;
        }        public ForwardingRuleServiceDirectoryRegistrationArgs build() {
            return new ForwardingRuleServiceDirectoryRegistrationArgs(namespace, service, serviceDirectoryRegion);
        }
    }
}
