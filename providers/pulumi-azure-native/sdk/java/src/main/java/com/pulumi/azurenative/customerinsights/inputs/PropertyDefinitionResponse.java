// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.azurenative.customerinsights.inputs.DataSourcePrecedenceResponse;
import com.pulumi.azurenative.customerinsights.inputs.ProfileEnumValidValuesFormatResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Property definition.
 * 
 */
public final class PropertyDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PropertyDefinitionResponse Empty = new PropertyDefinitionResponse();

    /**
     * Array value separator for properties with isArray set.
     * 
     */
    @Import(name="arrayValueSeparator")
    private @Nullable String arrayValueSeparator;

    public Optional<String> arrayValueSeparator() {
        return Optional.ofNullable(this.arrayValueSeparator);
    }

    /**
     * This is specific to interactions modeled as activities. Data sources are used to determine where data is stored and also in precedence rules.
     * 
     */
    @Import(name="dataSourcePrecedenceRules", required=true)
    private List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules;

    public List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules() {
        return this.dataSourcePrecedenceRules;
    }

    /**
     * Describes valid values for an enum property.
     * 
     */
    @Import(name="enumValidValues")
    private @Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues;

    public Optional<List<ProfileEnumValidValuesFormatResponse>> enumValidValues() {
        return Optional.ofNullable(this.enumValidValues);
    }

    /**
     * Name of the property.
     * 
     */
    @Import(name="fieldName", required=true)
    private String fieldName;

    public String fieldName() {
        return this.fieldName;
    }

    /**
     * Type of the property.
     * 
     */
    @Import(name="fieldType", required=true)
    private String fieldType;

    public String fieldType() {
        return this.fieldType;
    }

    /**
     * Indicates if the property is actually an array of the fieldType above on the data api.
     * 
     */
    @Import(name="isArray")
    private @Nullable Boolean isArray;

    public Optional<Boolean> isArray() {
        return Optional.ofNullable(this.isArray);
    }

    /**
     * Whether property is available in graph or not.
     * 
     */
    @Import(name="isAvailableInGraph")
    private @Nullable Boolean isAvailableInGraph;

    public Optional<Boolean> isAvailableInGraph() {
        return Optional.ofNullable(this.isAvailableInGraph);
    }

    /**
     * Indicates if the property is an enum.
     * 
     */
    @Import(name="isEnum")
    private @Nullable Boolean isEnum;

    public Optional<Boolean> isEnum() {
        return Optional.ofNullable(this.isEnum);
    }

    /**
     * Indicates if the property is an flag enum.
     * 
     */
    @Import(name="isFlagEnum")
    private @Nullable Boolean isFlagEnum;

    public Optional<Boolean> isFlagEnum() {
        return Optional.ofNullable(this.isFlagEnum);
    }

    /**
     * Whether the property is an Image.
     * 
     */
    @Import(name="isImage")
    private @Nullable Boolean isImage;

    public Optional<Boolean> isImage() {
        return Optional.ofNullable(this.isImage);
    }

    /**
     * Whether the property is a localized string.
     * 
     */
    @Import(name="isLocalizedString")
    private @Nullable Boolean isLocalizedString;

    public Optional<Boolean> isLocalizedString() {
        return Optional.ofNullable(this.isLocalizedString);
    }

    /**
     * Whether the property is a name or a part of name.
     * 
     */
    @Import(name="isName")
    private @Nullable Boolean isName;

    public Optional<Boolean> isName() {
        return Optional.ofNullable(this.isName);
    }

    /**
     * Whether property value is required on instances, IsRequired field only for Interaction. Profile Instance will not check for required field.
     * 
     */
    @Import(name="isRequired")
    private @Nullable Boolean isRequired;

    public Optional<Boolean> isRequired() {
        return Optional.ofNullable(this.isRequired);
    }

    /**
     * Max length of string. Used only if type is string.
     * 
     */
    @Import(name="maxLength")
    private @Nullable Integer maxLength;

    public Optional<Integer> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }

    /**
     * The ID associated with the property.
     * 
     */
    @Import(name="propertyId")
    private @Nullable String propertyId;

    public Optional<String> propertyId() {
        return Optional.ofNullable(this.propertyId);
    }

    /**
     * URL encoded schema.org item prop link for the property.
     * 
     */
    @Import(name="schemaItemPropLink")
    private @Nullable String schemaItemPropLink;

    public Optional<String> schemaItemPropLink() {
        return Optional.ofNullable(this.schemaItemPropLink);
    }

    private PropertyDefinitionResponse() {}

    private PropertyDefinitionResponse(PropertyDefinitionResponse $) {
        this.arrayValueSeparator = $.arrayValueSeparator;
        this.dataSourcePrecedenceRules = $.dataSourcePrecedenceRules;
        this.enumValidValues = $.enumValidValues;
        this.fieldName = $.fieldName;
        this.fieldType = $.fieldType;
        this.isArray = $.isArray;
        this.isAvailableInGraph = $.isAvailableInGraph;
        this.isEnum = $.isEnum;
        this.isFlagEnum = $.isFlagEnum;
        this.isImage = $.isImage;
        this.isLocalizedString = $.isLocalizedString;
        this.isName = $.isName;
        this.isRequired = $.isRequired;
        this.maxLength = $.maxLength;
        this.propertyId = $.propertyId;
        this.schemaItemPropLink = $.schemaItemPropLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyDefinitionResponse $;

        public Builder() {
            $ = new PropertyDefinitionResponse();
        }

        public Builder(PropertyDefinitionResponse defaults) {
            $ = new PropertyDefinitionResponse(Objects.requireNonNull(defaults));
        }

        public Builder arrayValueSeparator(@Nullable String arrayValueSeparator) {
            $.arrayValueSeparator = arrayValueSeparator;
            return this;
        }

        public Builder dataSourcePrecedenceRules(List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules) {
            $.dataSourcePrecedenceRules = dataSourcePrecedenceRules;
            return this;
        }

        public Builder dataSourcePrecedenceRules(DataSourcePrecedenceResponse... dataSourcePrecedenceRules) {
            return dataSourcePrecedenceRules(List.of(dataSourcePrecedenceRules));
        }

        public Builder enumValidValues(@Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues) {
            $.enumValidValues = enumValidValues;
            return this;
        }

        public Builder enumValidValues(ProfileEnumValidValuesFormatResponse... enumValidValues) {
            return enumValidValues(List.of(enumValidValues));
        }

        public Builder fieldName(String fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        public Builder fieldType(String fieldType) {
            $.fieldType = fieldType;
            return this;
        }

        public Builder isArray(@Nullable Boolean isArray) {
            $.isArray = isArray;
            return this;
        }

        public Builder isAvailableInGraph(@Nullable Boolean isAvailableInGraph) {
            $.isAvailableInGraph = isAvailableInGraph;
            return this;
        }

        public Builder isEnum(@Nullable Boolean isEnum) {
            $.isEnum = isEnum;
            return this;
        }

        public Builder isFlagEnum(@Nullable Boolean isFlagEnum) {
            $.isFlagEnum = isFlagEnum;
            return this;
        }

        public Builder isImage(@Nullable Boolean isImage) {
            $.isImage = isImage;
            return this;
        }

        public Builder isLocalizedString(@Nullable Boolean isLocalizedString) {
            $.isLocalizedString = isLocalizedString;
            return this;
        }

        public Builder isName(@Nullable Boolean isName) {
            $.isName = isName;
            return this;
        }

        public Builder isRequired(@Nullable Boolean isRequired) {
            $.isRequired = isRequired;
            return this;
        }

        public Builder maxLength(@Nullable Integer maxLength) {
            $.maxLength = maxLength;
            return this;
        }

        public Builder propertyId(@Nullable String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder schemaItemPropLink(@Nullable String schemaItemPropLink) {
            $.schemaItemPropLink = schemaItemPropLink;
            return this;
        }

        public PropertyDefinitionResponse build() {
            $.dataSourcePrecedenceRules = Objects.requireNonNull($.dataSourcePrecedenceRules, "expected parameter 'dataSourcePrecedenceRules' to be non-null");
            $.fieldName = Objects.requireNonNull($.fieldName, "expected parameter 'fieldName' to be non-null");
            $.fieldType = Objects.requireNonNull($.fieldType, "expected parameter 'fieldType' to be non-null");
            return $;
        }
    }

}
