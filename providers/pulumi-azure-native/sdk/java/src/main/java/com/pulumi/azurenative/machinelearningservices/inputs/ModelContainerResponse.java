// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final ModelContainerResponse Empty = new ModelContainerResponse();

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,String> properties;

    public Optional<Map<String,String>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelContainerResponse() {}

    private ModelContainerResponse(ModelContainerResponse $) {
        this.description = $.description;
        this.properties = $.properties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelContainerResponse $;

        public Builder() {
            $ = new ModelContainerResponse();
        }

        public Builder(ModelContainerResponse defaults) {
            $ = new ModelContainerResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public ModelContainerResponse build() {
            return $;
        }
    }

}
