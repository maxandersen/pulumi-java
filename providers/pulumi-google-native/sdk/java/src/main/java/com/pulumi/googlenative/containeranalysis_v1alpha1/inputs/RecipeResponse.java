// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

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
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint.
     * 
     */
    @Import(name="arguments", required=true)
    private List<Map<String,String>> arguments;

    public List<Map<String,String>> arguments() {
        return this.arguments;
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
     * 
     */
    @Import(name="definedInMaterial", required=true)
    private String definedInMaterial;

    public String definedInMaterial() {
        return this.definedInMaterial;
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @Import(name="entryPoint", required=true)
    private String entryPoint;

    public String entryPoint() {
        return this.entryPoint;
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy.
     * 
     */
    @Import(name="environment", required=true)
    private List<Map<String,String>> environment;

    public List<Map<String,String>> environment() {
        return this.environment;
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private RecipeResponse() {}

    private RecipeResponse(RecipeResponse $) {
        this.arguments = $.arguments;
        this.definedInMaterial = $.definedInMaterial;
        this.entryPoint = $.entryPoint;
        this.environment = $.environment;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecipeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecipeResponse $;

        public Builder() {
            $ = new RecipeResponse();
        }

        public Builder(RecipeResponse defaults) {
            $ = new RecipeResponse(Objects.requireNonNull(defaults));
        }

        public Builder arguments(List<Map<String,String>> arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder arguments(Map<String,String>... arguments) {
            return arguments(List.of(arguments));
        }

        public Builder definedInMaterial(String definedInMaterial) {
            $.definedInMaterial = definedInMaterial;
            return this;
        }

        public Builder entryPoint(String entryPoint) {
            $.entryPoint = entryPoint;
            return this;
        }

        public Builder environment(List<Map<String,String>> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(Map<String,String>... environment) {
            return environment(List.of(environment));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RecipeResponse build() {
            $.arguments = Objects.requireNonNull($.arguments, "expected parameter 'arguments' to be non-null");
            $.definedInMaterial = Objects.requireNonNull($.definedInMaterial, "expected parameter 'definedInMaterial' to be non-null");
            $.entryPoint = Objects.requireNonNull($.entryPoint, "expected parameter 'entryPoint' to be non-null");
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
