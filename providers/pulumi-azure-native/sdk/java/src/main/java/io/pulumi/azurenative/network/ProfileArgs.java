// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AllowedEndpointRecordType;
import io.pulumi.azurenative.network.enums.ProfileStatus;
import io.pulumi.azurenative.network.enums.TrafficRoutingMethod;
import io.pulumi.azurenative.network.enums.TrafficViewEnrollmentStatus;
import io.pulumi.azurenative.network.inputs.DnsConfigArgs;
import io.pulumi.azurenative.network.inputs.EndpointArgs;
import io.pulumi.azurenative.network.inputs.MonitorConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfileArgs Empty = new ProfileArgs();

    /**
     * The list of allowed endpoint record types.
     * 
     */
    @Import(name="allowedEndpointRecordTypes")
      private final @Nullable Output<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes;

    public Output<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes() {
        return this.allowedEndpointRecordTypes == null ? Codegen.empty() : this.allowedEndpointRecordTypes;
    }

    /**
     * The DNS settings of the Traffic Manager profile.
     * 
     */
    @Import(name="dnsConfig")
      private final @Nullable Output<DnsConfigArgs> dnsConfig;

    public Output<DnsConfigArgs> dnsConfig() {
        return this.dnsConfig == null ? Codegen.empty() : this.dnsConfig;
    }

    /**
     * The list of endpoints in the Traffic Manager profile.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<EndpointArgs>> endpoints;

    public Output<List<EndpointArgs>> endpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The Azure Region where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     */
    @Import(name="maxReturn")
      private final @Nullable Output<Double> maxReturn;

    public Output<Double> maxReturn() {
        return this.maxReturn == null ? Codegen.empty() : this.maxReturn;
    }

    /**
     * The endpoint monitoring settings of the Traffic Manager profile.
     * 
     */
    @Import(name="monitorConfig")
      private final @Nullable Output<MonitorConfigArgs> monitorConfig;

    public Output<MonitorConfigArgs> monitorConfig() {
        return this.monitorConfig == null ? Codegen.empty() : this.monitorConfig;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the Traffic Manager profile.
     * 
     */
    @Import(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName == null ? Codegen.empty() : this.profileName;
    }

    /**
     * The status of the Traffic Manager profile.
     * 
     */
    @Import(name="profileStatus")
      private final @Nullable Output<Either<String,ProfileStatus>> profileStatus;

    public Output<Either<String,ProfileStatus>> profileStatus() {
        return this.profileStatus == null ? Codegen.empty() : this.profileStatus;
    }

    /**
     * The name of the resource group containing the Traffic Manager profile.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The traffic routing method of the Traffic Manager profile.
     * 
     */
    @Import(name="trafficRoutingMethod")
      private final @Nullable Output<Either<String,TrafficRoutingMethod>> trafficRoutingMethod;

    public Output<Either<String,TrafficRoutingMethod>> trafficRoutingMethod() {
        return this.trafficRoutingMethod == null ? Codegen.empty() : this.trafficRoutingMethod;
    }

    /**
     * Indicates whether Traffic View is 'Enabled' or 'Disabled' for the Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
     */
    @Import(name="trafficViewEnrollmentStatus")
      private final @Nullable Output<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus;

    public Output<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus() {
        return this.trafficViewEnrollmentStatus == null ? Codegen.empty() : this.trafficViewEnrollmentStatus;
    }

    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ProfileArgs(
        @Nullable Output<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes,
        @Nullable Output<DnsConfigArgs> dnsConfig,
        @Nullable Output<List<EndpointArgs>> endpoints,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<Double> maxReturn,
        @Nullable Output<MonitorConfigArgs> monitorConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> profileName,
        @Nullable Output<Either<String,ProfileStatus>> profileStatus,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Either<String,TrafficRoutingMethod>> trafficRoutingMethod,
        @Nullable Output<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus,
        @Nullable Output<String> type) {
        this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
        this.dnsConfig = dnsConfig;
        this.endpoints = endpoints;
        this.id = id;
        this.location = location;
        this.maxReturn = maxReturn;
        this.monitorConfig = monitorConfig;
        this.name = name;
        this.profileName = profileName;
        this.profileStatus = profileStatus;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.trafficRoutingMethod = trafficRoutingMethod;
        this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
        this.type = type;
    }

    private ProfileArgs() {
        this.allowedEndpointRecordTypes = Codegen.empty();
        this.dnsConfig = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.maxReturn = Codegen.empty();
        this.monitorConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.profileName = Codegen.empty();
        this.profileStatus = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.trafficRoutingMethod = Codegen.empty();
        this.trafficViewEnrollmentStatus = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes;
        private @Nullable Output<DnsConfigArgs> dnsConfig;
        private @Nullable Output<List<EndpointArgs>> endpoints;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<Double> maxReturn;
        private @Nullable Output<MonitorConfigArgs> monitorConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> profileName;
        private @Nullable Output<Either<String,ProfileStatus>> profileStatus;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Either<String,TrafficRoutingMethod>> trafficRoutingMethod;
        private @Nullable Output<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedEndpointRecordTypes = defaults.allowedEndpointRecordTypes;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.endpoints = defaults.endpoints;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxReturn = defaults.maxReturn;
    	      this.monitorConfig = defaults.monitorConfig;
    	      this.name = defaults.name;
    	      this.profileName = defaults.profileName;
    	      this.profileStatus = defaults.profileStatus;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.trafficRoutingMethod = defaults.trafficRoutingMethod;
    	      this.trafficViewEnrollmentStatus = defaults.trafficViewEnrollmentStatus;
    	      this.type = defaults.type;
        }

        public Builder allowedEndpointRecordTypes(@Nullable Output<List<Either<String,AllowedEndpointRecordType>>> allowedEndpointRecordTypes) {
            this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
            return this;
        }
        public Builder allowedEndpointRecordTypes(@Nullable List<Either<String,AllowedEndpointRecordType>> allowedEndpointRecordTypes) {
            this.allowedEndpointRecordTypes = Codegen.ofNullable(allowedEndpointRecordTypes);
            return this;
        }
        public Builder allowedEndpointRecordTypes(Either<String,AllowedEndpointRecordType>... allowedEndpointRecordTypes) {
            return allowedEndpointRecordTypes(List.of(allowedEndpointRecordTypes));
        }
        public Builder dnsConfig(@Nullable Output<DnsConfigArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public Builder dnsConfig(@Nullable DnsConfigArgs dnsConfig) {
            this.dnsConfig = Codegen.ofNullable(dnsConfig);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<EndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<EndpointArgs> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(EndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder maxReturn(@Nullable Output<Double> maxReturn) {
            this.maxReturn = maxReturn;
            return this;
        }
        public Builder maxReturn(@Nullable Double maxReturn) {
            this.maxReturn = Codegen.ofNullable(maxReturn);
            return this;
        }
        public Builder monitorConfig(@Nullable Output<MonitorConfigArgs> monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public Builder monitorConfig(@Nullable MonitorConfigArgs monitorConfig) {
            this.monitorConfig = Codegen.ofNullable(monitorConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = Codegen.ofNullable(profileName);
            return this;
        }
        public Builder profileStatus(@Nullable Output<Either<String,ProfileStatus>> profileStatus) {
            this.profileStatus = profileStatus;
            return this;
        }
        public Builder profileStatus(@Nullable Either<String,ProfileStatus> profileStatus) {
            this.profileStatus = Codegen.ofNullable(profileStatus);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder trafficRoutingMethod(@Nullable Output<Either<String,TrafficRoutingMethod>> trafficRoutingMethod) {
            this.trafficRoutingMethod = trafficRoutingMethod;
            return this;
        }
        public Builder trafficRoutingMethod(@Nullable Either<String,TrafficRoutingMethod> trafficRoutingMethod) {
            this.trafficRoutingMethod = Codegen.ofNullable(trafficRoutingMethod);
            return this;
        }
        public Builder trafficViewEnrollmentStatus(@Nullable Output<Either<String,TrafficViewEnrollmentStatus>> trafficViewEnrollmentStatus) {
            this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
            return this;
        }
        public Builder trafficViewEnrollmentStatus(@Nullable Either<String,TrafficViewEnrollmentStatus> trafficViewEnrollmentStatus) {
            this.trafficViewEnrollmentStatus = Codegen.ofNullable(trafficViewEnrollmentStatus);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ProfileArgs build() {
            return new ProfileArgs(allowedEndpointRecordTypes, dnsConfig, endpoints, id, location, maxReturn, monitorConfig, name, profileName, profileStatus, resourceGroupName, tags, trafficRoutingMethod, trafficViewEnrollmentStatus, type);
        }
    }
}
