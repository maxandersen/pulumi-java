// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class RecipeResponse {
    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint.
     * 
     */
    private final List<Map<String,String>> arguments;
    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
     */
    private final String definedInMaterial;
    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    private final String entryPoint;
    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy.
     * 
     */
    private final List<Map<String,String>> environment;
    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private RecipeResponse(
        @OutputCustomType.Parameter("arguments") List<Map<String,String>> arguments,
        @OutputCustomType.Parameter("definedInMaterial") String definedInMaterial,
        @OutputCustomType.Parameter("entryPoint") String entryPoint,
        @OutputCustomType.Parameter("environment") List<Map<String,String>> environment,
        @OutputCustomType.Parameter("type") String type) {
        this.arguments = arguments;
        this.definedInMaterial = definedInMaterial;
        this.entryPoint = entryPoint;
        this.environment = environment;
        this.type = type;
    }

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint.
     * 
    */
    public List<Map<String,String>> getArguments() {
        return this.arguments;
    }
    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
    */
    public String getDefinedInMaterial() {
        return this.definedInMaterial;
    }
    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
    */
    public String getEntryPoint() {
        return this.entryPoint;
    }
    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy.
     * 
    */
    public List<Map<String,String>> getEnvironment() {
        return this.environment;
    }
    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Map<String,String>> arguments;
        private String definedInMaterial;
        private String entryPoint;
        private List<Map<String,String>> environment;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.definedInMaterial = defaults.definedInMaterial;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environment = defaults.environment;
    	      this.type = defaults.type;
        }

        public Builder setArguments(List<Map<String,String>> arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder setDefinedInMaterial(String definedInMaterial) {
            this.definedInMaterial = Objects.requireNonNull(definedInMaterial);
            return this;
        }

        public Builder setEntryPoint(String entryPoint) {
            this.entryPoint = Objects.requireNonNull(entryPoint);
            return this;
        }

        public Builder setEnvironment(List<Map<String,String>> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RecipeResponse build() {
            return new RecipeResponse(arguments, definedInMaterial, entryPoint, environment, type);
        }
    }
}
