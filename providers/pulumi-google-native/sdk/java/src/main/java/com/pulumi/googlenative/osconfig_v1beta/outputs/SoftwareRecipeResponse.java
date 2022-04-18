// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1beta.outputs.SoftwareRecipeArtifactResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.SoftwareRecipeStepResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeResponse {
    /**
     * Resources available to be used in the steps in the recipe.
     * 
     */
    private final List<SoftwareRecipeArtifactResponse> artifacts;
    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won't be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * 
     */
    private final String desiredState;
    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    private final List<SoftwareRecipeStepResponse> installSteps;
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
     * 
     */
    private final String name;
    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    private final List<SoftwareRecipeStepResponse> updateSteps;
    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    private final String version;

    @CustomType.Constructor
    private SoftwareRecipeResponse(
        @CustomType.Parameter("artifacts") List<SoftwareRecipeArtifactResponse> artifacts,
        @CustomType.Parameter("desiredState") String desiredState,
        @CustomType.Parameter("installSteps") List<SoftwareRecipeStepResponse> installSteps,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateSteps") List<SoftwareRecipeStepResponse> updateSteps,
        @CustomType.Parameter("version") String version) {
        this.artifacts = artifacts;
        this.desiredState = desiredState;
        this.installSteps = installSteps;
        this.name = name;
        this.updateSteps = updateSteps;
        this.version = version;
    }

    /**
     * Resources available to be used in the steps in the recipe.
     * 
    */
    public List<SoftwareRecipeArtifactResponse> artifacts() {
        return this.artifacts;
    }
    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won't be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * 
    */
    public String desiredState() {
        return this.desiredState;
    }
    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
     * 
    */
    public List<SoftwareRecipeStepResponse> installSteps() {
        return this.installSteps;
    }
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
     * 
    */
    public List<SoftwareRecipeStepResponse> updateSteps() {
        return this.updateSteps;
    }
    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SoftwareRecipeArtifactResponse> artifacts;
        private String desiredState;
        private List<SoftwareRecipeStepResponse> installSteps;
        private String name;
        private List<SoftwareRecipeStepResponse> updateSteps;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.desiredState = defaults.desiredState;
    	      this.installSteps = defaults.installSteps;
    	      this.name = defaults.name;
    	      this.updateSteps = defaults.updateSteps;
    	      this.version = defaults.version;
        }

        public Builder artifacts(List<SoftwareRecipeArtifactResponse> artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }
        public Builder artifacts(SoftwareRecipeArtifactResponse... artifacts) {
            return artifacts(List.of(artifacts));
        }
        public Builder desiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder installSteps(List<SoftwareRecipeStepResponse> installSteps) {
            this.installSteps = Objects.requireNonNull(installSteps);
            return this;
        }
        public Builder installSteps(SoftwareRecipeStepResponse... installSteps) {
            return installSteps(List.of(installSteps));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateSteps(List<SoftwareRecipeStepResponse> updateSteps) {
            this.updateSteps = Objects.requireNonNull(updateSteps);
            return this;
        }
        public Builder updateSteps(SoftwareRecipeStepResponse... updateSteps) {
            return updateSteps(List.of(updateSteps));
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public SoftwareRecipeResponse build() {
            return new SoftwareRecipeResponse(artifacts, desiredState, installSteps, name, updateSteps, version);
        }
    }
}
