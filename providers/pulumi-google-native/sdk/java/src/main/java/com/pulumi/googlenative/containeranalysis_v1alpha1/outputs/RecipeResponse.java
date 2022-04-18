// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private RecipeResponse(
        @CustomType.Parameter("arguments") List<Map<String,String>> arguments,
        @CustomType.Parameter("definedInMaterial") String definedInMaterial,
        @CustomType.Parameter("entryPoint") String entryPoint,
        @CustomType.Parameter("environment") List<Map<String,String>> environment,
        @CustomType.Parameter("type") String type) {
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
    public List<Map<String,String>> arguments() {
        return this.arguments;
    }
    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
    */
    public String definedInMaterial() {
        return this.definedInMaterial;
    }
    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
    */
    public String entryPoint() {
        return this.entryPoint;
    }
    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy.
     * 
    */
    public List<Map<String,String>> environment() {
        return this.environment;
    }
    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
    */
    public String type() {
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

        public Builder arguments(List<Map<String,String>> arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }
        public Builder definedInMaterial(String definedInMaterial) {
            this.definedInMaterial = Objects.requireNonNull(definedInMaterial);
            return this;
        }
        public Builder entryPoint(String entryPoint) {
            this.entryPoint = Objects.requireNonNull(entryPoint);
            return this;
        }
        public Builder environment(List<Map<String,String>> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RecipeResponse build() {
            return new RecipeResponse(arguments, definedInMaterial, entryPoint, environment, type);
        }
    }
}
