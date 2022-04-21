// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster.
 * 
 */
public final class DefaultSnatStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final DefaultSnatStatusResponse Empty = new DefaultSnatStatusResponse();

    /**
     * Disables cluster default sNAT rules.
     * 
     */
    @Import(name="disabled", required=true)
    private Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    private DefaultSnatStatusResponse() {}

    private DefaultSnatStatusResponse(DefaultSnatStatusResponse $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSnatStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSnatStatusResponse $;

        public Builder() {
            $ = new DefaultSnatStatusResponse();
        }

        public Builder(DefaultSnatStatusResponse defaults) {
            $ = new DefaultSnatStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder disabled(Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        public DefaultSnatStatusResponse build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
