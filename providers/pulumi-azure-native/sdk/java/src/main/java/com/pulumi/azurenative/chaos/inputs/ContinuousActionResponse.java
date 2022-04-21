// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.azurenative.chaos.inputs.KeyValuePairResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a continuous action.
 * 
 */
public final class ContinuousActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContinuousActionResponse Empty = new ContinuousActionResponse();

    /**
     * ISO8601 formatted string that represents a duration.
     * 
     */
    @Import(name="duration", required=true)
    private String duration;

    public String duration() {
        return this.duration;
    }

    /**
     * String that represents a Capability URN.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * List of key value pairs.
     * 
     */
    @Import(name="parameters", required=true)
    private List<KeyValuePairResponse> parameters;

    public List<KeyValuePairResponse> parameters() {
        return this.parameters;
    }

    /**
     * String that represents a selector.
     * 
     */
    @Import(name="selectorId", required=true)
    private String selectorId;

    public String selectorId() {
        return this.selectorId;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is &#39;continuous&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ContinuousActionResponse() {}

    private ContinuousActionResponse(ContinuousActionResponse $) {
        this.duration = $.duration;
        this.name = $.name;
        this.parameters = $.parameters;
        this.selectorId = $.selectorId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContinuousActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContinuousActionResponse $;

        public Builder() {
            $ = new ContinuousActionResponse();
        }

        public Builder(ContinuousActionResponse defaults) {
            $ = new ContinuousActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder duration(String duration) {
            $.duration = duration;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(List<KeyValuePairResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(KeyValuePairResponse... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder selectorId(String selectorId) {
            $.selectorId = selectorId;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ContinuousActionResponse build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.selectorId = Objects.requireNonNull($.selectorId, "expected parameter 'selectorId' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
