// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A feature for gallery image.
 * 
 */
public final class GalleryImageFeatureArgs extends ResourceArgs {

    public static final GalleryImageFeatureArgs Empty = new GalleryImageFeatureArgs();

    /**
     * The name of the gallery image feature.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the gallery image feature.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the gallery image feature.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the gallery image feature.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GalleryImageFeatureArgs() {}

    private GalleryImageFeatureArgs(GalleryImageFeatureArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageFeatureArgs $;

        public Builder() {
            $ = new GalleryImageFeatureArgs();
        }

        public Builder(GalleryImageFeatureArgs defaults) {
            $ = new GalleryImageFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the gallery image feature.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the gallery image feature.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the gallery image feature.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the gallery image feature.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GalleryImageFeatureArgs build() {
            return $;
        }
    }

}
