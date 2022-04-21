// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.awsnative.iotsitewise.inputs.AssetModelProperty;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a composite model definition in an asset model. This composite model definition is applied to all assets created from the asset model.
 * 
 */
public final class AssetModelCompositeModel extends com.pulumi.resources.InvokeArgs {

    public static final AssetModelCompositeModel Empty = new AssetModelCompositeModel();

    /**
     * The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    @Import(name="compositeModelProperties")
    private @Nullable List<AssetModelProperty> compositeModelProperties;

    public Optional<List<AssetModelProperty>> compositeModelProperties() {
        return Optional.ofNullable(this.compositeModelProperties);
    }

    /**
     * A description for the asset composite model.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A unique, friendly name for the asset composite model.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private AssetModelCompositeModel() {}

    private AssetModelCompositeModel(AssetModelCompositeModel $) {
        this.compositeModelProperties = $.compositeModelProperties;
        this.description = $.description;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelCompositeModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelCompositeModel $;

        public Builder() {
            $ = new AssetModelCompositeModel();
        }

        public Builder(AssetModelCompositeModel defaults) {
            $ = new AssetModelCompositeModel(Objects.requireNonNull(defaults));
        }

        public Builder compositeModelProperties(@Nullable List<AssetModelProperty> compositeModelProperties) {
            $.compositeModelProperties = compositeModelProperties;
            return this;
        }

        public Builder compositeModelProperties(AssetModelProperty... compositeModelProperties) {
            return compositeModelProperties(List.of(compositeModelProperties));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AssetModelCompositeModel build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
