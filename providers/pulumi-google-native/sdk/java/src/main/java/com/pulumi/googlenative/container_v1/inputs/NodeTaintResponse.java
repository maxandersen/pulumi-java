// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes taint is comprised of three fields: key, value, and effect. Effect can only be one of three types: NoSchedule, PreferNoSchedule or NoExecute. See [here](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration) for more information, including usage and the valid values.
 * 
 */
public final class NodeTaintResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeTaintResponse Empty = new NodeTaintResponse();

    /**
     * Effect for taint.
     * 
     */
    @Import(name="effect", required=true)
    private String effect;

    public String effect() {
        return this.effect;
    }

    /**
     * Key for taint.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Value for taint.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private NodeTaintResponse() {}

    private NodeTaintResponse(NodeTaintResponse $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTaintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTaintResponse $;

        public Builder() {
            $ = new NodeTaintResponse();
        }

        public Builder(NodeTaintResponse defaults) {
            $ = new NodeTaintResponse(Objects.requireNonNull(defaults));
        }

        public Builder effect(String effect) {
            $.effect = effect;
            return this;
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public NodeTaintResponse build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
