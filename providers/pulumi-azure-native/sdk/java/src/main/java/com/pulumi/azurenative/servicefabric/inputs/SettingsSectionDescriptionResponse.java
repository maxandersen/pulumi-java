// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.SettingsParameterDescriptionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a section in the fabric settings of the cluster.
 * 
 */
public final class SettingsSectionDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final SettingsSectionDescriptionResponse Empty = new SettingsSectionDescriptionResponse();

    /**
     * The section name of the fabric settings.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The collection of parameters in the section.
     * 
     */
    @Import(name="parameters", required=true)
    private List<SettingsParameterDescriptionResponse> parameters;

    public List<SettingsParameterDescriptionResponse> parameters() {
        return this.parameters;
    }

    private SettingsSectionDescriptionResponse() {}

    private SettingsSectionDescriptionResponse(SettingsSectionDescriptionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsSectionDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsSectionDescriptionResponse $;

        public Builder() {
            $ = new SettingsSectionDescriptionResponse();
        }

        public Builder(SettingsSectionDescriptionResponse defaults) {
            $ = new SettingsSectionDescriptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(List<SettingsParameterDescriptionResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SettingsParameterDescriptionResponse... parameters) {
            return parameters(List.of(parameters));
        }

        public SettingsSectionDescriptionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
