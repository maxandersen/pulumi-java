// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains a key/value pair that sets the named component parameter.
 * 
 */
public final class ImageRecipeComponentParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRecipeComponentParameterArgs Empty = new ImageRecipeComponentParameterArgs();

    /**
     * The name of the component parameter to set.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Sets the value for the named component parameter.
     * 
     */
    @Import(name="value", required=true)
    private Output<List<String>> value;

    public Output<List<String>> value() {
        return this.value;
    }

    private ImageRecipeComponentParameterArgs() {}

    private ImageRecipeComponentParameterArgs(ImageRecipeComponentParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRecipeComponentParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRecipeComponentParameterArgs $;

        public Builder() {
            $ = new ImageRecipeComponentParameterArgs();
        }

        public Builder(ImageRecipeComponentParameterArgs defaults) {
            $ = new ImageRecipeComponentParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(Output<List<String>> value) {
            $.value = value;
            return this;
        }

        public Builder value(List<String> value) {
            return value(Output.of(value));
        }

        public Builder value(String... value) {
            return value(List.of(value));
        }

        public ImageRecipeComponentParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
