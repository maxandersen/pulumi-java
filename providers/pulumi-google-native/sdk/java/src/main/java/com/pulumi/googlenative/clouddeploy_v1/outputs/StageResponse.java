// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StageResponse {
    /**
     * Skaffold profiles to use when rendering the manifest for this stage&#39;s `Target`.
     * 
     */
    private final List<String> profiles;
    /**
     * The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
     * 
     */
    private final String targetId;

    @CustomType.Constructor
    private StageResponse(
        @CustomType.Parameter("profiles") List<String> profiles,
        @CustomType.Parameter("targetId") String targetId) {
        this.profiles = profiles;
        this.targetId = targetId;
    }

    /**
     * Skaffold profiles to use when rendering the manifest for this stage&#39;s `Target`.
     * 
    */
    public List<String> profiles() {
        return this.profiles;
    }
    /**
     * The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
     * 
    */
    public String targetId() {
        return this.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> profiles;
        private String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(StageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profiles = defaults.profiles;
    	      this.targetId = defaults.targetId;
        }

        public Builder profiles(List<String> profiles) {
            this.profiles = Objects.requireNonNull(profiles);
            return this;
        }
        public Builder profiles(String... profiles) {
            return profiles(List.of(profiles));
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }        public StageResponse build() {
            return new StageResponse(profiles, targetId);
        }
    }
}
