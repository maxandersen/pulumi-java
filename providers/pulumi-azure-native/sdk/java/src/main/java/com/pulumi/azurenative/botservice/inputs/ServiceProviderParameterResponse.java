// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.ServiceProviderParameterResponseMetadata;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Extra Parameters specific to each Service Provider
 * 
 */
public final class ServiceProviderParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceProviderParameterResponse Empty = new ServiceProviderParameterResponse();

    /**
     * Default Name for the Service Provider
     * 
     */
    @Import(name="default", required=true)
    private String default_;

    public String default_() {
        return this.default_;
    }

    /**
     * Description of the Service Provider
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Display Name of the Service Provider
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Help Url for the  Service Provider
     * 
     */
    @Import(name="helpUrl", required=true)
    private String helpUrl;

    public String helpUrl() {
        return this.helpUrl;
    }

    /**
     * Meta data for the Service Provider
     * 
     */
    @Import(name="metadata", required=true)
    private ServiceProviderParameterResponseMetadata metadata;

    public ServiceProviderParameterResponseMetadata metadata() {
        return this.metadata;
    }

    /**
     * Name of the Service Provider
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Type of the Service Provider
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ServiceProviderParameterResponse() {}

    private ServiceProviderParameterResponse(ServiceProviderParameterResponse $) {
        this.default_ = $.default_;
        this.description = $.description;
        this.displayName = $.displayName;
        this.helpUrl = $.helpUrl;
        this.metadata = $.metadata;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProviderParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProviderParameterResponse $;

        public Builder() {
            $ = new ServiceProviderParameterResponse();
        }

        public Builder(ServiceProviderParameterResponse defaults) {
            $ = new ServiceProviderParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder default_(String default_) {
            $.default_ = default_;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder helpUrl(String helpUrl) {
            $.helpUrl = helpUrl;
            return this;
        }

        public Builder metadata(ServiceProviderParameterResponseMetadata metadata) {
            $.metadata = metadata;
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

        public ServiceProviderParameterResponse build() {
            $.default_ = Objects.requireNonNull($.default_, "expected parameter 'default' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.helpUrl = Objects.requireNonNull($.helpUrl, "expected parameter 'helpUrl' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
