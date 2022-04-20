// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.cdn.enums.EnabledState;
import com.pulumi.azurenative.cdn.inputs.HealthProbeParametersArgs;
import com.pulumi.azurenative.cdn.inputs.LoadBalancingSettingsParametersArgs;
import com.pulumi.azurenative.cdn.inputs.ResponseBasedOriginErrorDetectionParametersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AFDOriginGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AFDOriginGroupArgs Empty = new AFDOriginGroupArgs();

    /**
     * Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    @Import(name="healthProbeSettings")
      private final @Nullable Output<HealthProbeParametersArgs> healthProbeSettings;

    public Output<HealthProbeParametersArgs> healthProbeSettings() {
        return this.healthProbeSettings == null ? Codegen.empty() : this.healthProbeSettings;
    }

    /**
     * Load balancing settings for a backend pool
     * 
     */
    @Import(name="loadBalancingSettings")
      private final @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings;

    public Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings() {
        return this.loadBalancingSettings == null ? Codegen.empty() : this.loadBalancingSettings;
    }

    /**
     * Name of the origin group which is unique within the endpoint.
     * 
     */
    @Import(name="originGroupName")
      private final @Nullable Output<String> originGroupName;

    public Output<String> originGroupName() {
        return this.originGroupName == null ? Codegen.empty() : this.originGroupName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    @Import(name="responseBasedAfdOriginErrorDetectionSettings")
      private final @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings;

    public Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings() {
        return this.responseBasedAfdOriginErrorDetectionSettings == null ? Codegen.empty() : this.responseBasedAfdOriginErrorDetectionSettings;
    }

    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="sessionAffinityState")
      private final @Nullable Output<Either<String,EnabledState>> sessionAffinityState;

    public Output<Either<String,EnabledState>> sessionAffinityState() {
        return this.sessionAffinityState == null ? Codegen.empty() : this.sessionAffinityState;
    }

    /**
     * Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    @Import(name="trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
      private final @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    public Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes == null ? Codegen.empty() : this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    public AFDOriginGroupArgs(
        @Nullable Output<HealthProbeParametersArgs> healthProbeSettings,
        @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings,
        @Nullable Output<String> originGroupName,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings,
        @Nullable Output<Either<String,EnabledState>> sessionAffinityState,
        @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.healthProbeSettings = healthProbeSettings;
        this.loadBalancingSettings = loadBalancingSettings;
        this.originGroupName = originGroupName;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.responseBasedAfdOriginErrorDetectionSettings = responseBasedAfdOriginErrorDetectionSettings;
        this.sessionAffinityState = sessionAffinityState;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    private AFDOriginGroupArgs() {
        this.healthProbeSettings = Codegen.empty();
        this.loadBalancingSettings = Codegen.empty();
        this.originGroupName = Codegen.empty();
        this.profileName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.responseBasedAfdOriginErrorDetectionSettings = Codegen.empty();
        this.sessionAffinityState = Codegen.empty();
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HealthProbeParametersArgs> healthProbeSettings;
        private @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings;
        private @Nullable Output<String> originGroupName;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings;
        private @Nullable Output<Either<String,EnabledState>> sessionAffinityState;
        private @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDOriginGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.originGroupName = defaults.originGroupName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.responseBasedAfdOriginErrorDetectionSettings = defaults.responseBasedAfdOriginErrorDetectionSettings;
    	      this.sessionAffinityState = defaults.sessionAffinityState;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        }

        public Builder healthProbeSettings(@Nullable Output<HealthProbeParametersArgs> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }
        public Builder healthProbeSettings(@Nullable HealthProbeParametersArgs healthProbeSettings) {
            this.healthProbeSettings = Codegen.ofNullable(healthProbeSettings);
            return this;
        }
        public Builder loadBalancingSettings(@Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }
        public Builder loadBalancingSettings(@Nullable LoadBalancingSettingsParametersArgs loadBalancingSettings) {
            this.loadBalancingSettings = Codegen.ofNullable(loadBalancingSettings);
            return this;
        }
        public Builder originGroupName(@Nullable Output<String> originGroupName) {
            this.originGroupName = originGroupName;
            return this;
        }
        public Builder originGroupName(@Nullable String originGroupName) {
            this.originGroupName = Codegen.ofNullable(originGroupName);
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
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
        public Builder responseBasedAfdOriginErrorDetectionSettings(@Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings) {
            this.responseBasedAfdOriginErrorDetectionSettings = responseBasedAfdOriginErrorDetectionSettings;
            return this;
        }
        public Builder responseBasedAfdOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersArgs responseBasedAfdOriginErrorDetectionSettings) {
            this.responseBasedAfdOriginErrorDetectionSettings = Codegen.ofNullable(responseBasedAfdOriginErrorDetectionSettings);
            return this;
        }
        public Builder sessionAffinityState(@Nullable Output<Either<String,EnabledState>> sessionAffinityState) {
            this.sessionAffinityState = sessionAffinityState;
            return this;
        }
        public Builder sessionAffinityState(@Nullable Either<String,EnabledState> sessionAffinityState) {
            this.sessionAffinityState = Codegen.ofNullable(sessionAffinityState);
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Codegen.ofNullable(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
            return this;
        }        public AFDOriginGroupArgs build() {
            return new AFDOriginGroupArgs(healthProbeSettings, loadBalancingSettings, originGroupName, profileName, resourceGroupName, responseBasedAfdOriginErrorDetectionSettings, sessionAffinityState, trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
    }
}
