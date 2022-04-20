// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Steps taken to build the artifact. For a TaskRun, typically each container corresponds to one step in the recipe.
 * 
 */
public final class RecipeResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecipeResponse Empty = new RecipeResponse();

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Since the arguments field can greatly vary in structure, depending on the builder and recipe type, this is of form &#34;Any&#34;.
     * 
     */
    @Import(name="arguments", required=true)
      private final List<Map<String,String>> arguments;

    public List<Map<String,String>> arguments() {
        return this.arguments;
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
     * 
     */
    @Import(name="definedInMaterial", required=true)
      private final String definedInMaterial;

    public String definedInMaterial() {
        return this.definedInMaterial;
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @Import(name="entryPoint", required=true)
      private final String entryPoint;

    public String entryPoint() {
        return this.entryPoint;
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Since the environment field can greatly vary in structure, depending on the builder and recipe type, this is of form &#34;Any&#34;.
     * 
     */
    @Import(name="environment", required=true)
      private final List<Map<String,String>> environment;

    public List<Map<String,String>> environment() {
        return this.environment;
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public RecipeResponse(
        List<Map<String,String>> arguments,
        String definedInMaterial,
        String entryPoint,
        List<Map<String,String>> environment,
        String type) {
        this.arguments = Objects.requireNonNull(arguments, "expected parameter 'arguments' to be non-null");
        this.definedInMaterial = Objects.requireNonNull(definedInMaterial, "expected parameter 'definedInMaterial' to be non-null");
        this.entryPoint = Objects.requireNonNull(entryPoint, "expected parameter 'entryPoint' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RecipeResponse() {
        this.arguments = List.of();
        this.definedInMaterial = null;
        this.entryPoint = null;
        this.environment = List.of();
        this.type = null;
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
