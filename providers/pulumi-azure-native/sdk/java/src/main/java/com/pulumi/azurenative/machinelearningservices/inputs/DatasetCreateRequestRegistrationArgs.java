// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetCreateRequestRegistrationArgs extends ResourceArgs {

    public static final DatasetCreateRequestRegistrationArgs Empty = new DatasetCreateRequestRegistrationArgs();

    /**
     * The description for the dataset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the dataset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the dataset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the dataset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with the dataset.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags associated with the dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatasetCreateRequestRegistrationArgs() {}

    private DatasetCreateRequestRegistrationArgs(DatasetCreateRequestRegistrationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetCreateRequestRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetCreateRequestRegistrationArgs $;

        public Builder() {
            $ = new DatasetCreateRequestRegistrationArgs();
        }

        public Builder(DatasetCreateRequestRegistrationArgs defaults) {
            $ = new DatasetCreateRequestRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description for the dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags associated with the dataset.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with the dataset.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DatasetCreateRequestRegistrationArgs build() {
            return $;
        }
    }

}
