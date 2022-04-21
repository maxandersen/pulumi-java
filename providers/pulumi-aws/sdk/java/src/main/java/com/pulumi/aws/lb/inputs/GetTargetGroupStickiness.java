// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetTargetGroupStickiness extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetGroupStickiness Empty = new GetTargetGroupStickiness();

    @Import(name="cookieDuration", required=true)
    private Integer cookieDuration;

    public Integer cookieDuration() {
        return this.cookieDuration;
    }

    @Import(name="cookieName", required=true)
    private String cookieName;

    public String cookieName() {
        return this.cookieName;
    }

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetTargetGroupStickiness() {}

    private GetTargetGroupStickiness(GetTargetGroupStickiness $) {
        this.cookieDuration = $.cookieDuration;
        this.cookieName = $.cookieName;
        this.enabled = $.enabled;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetGroupStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetGroupStickiness $;

        public Builder() {
            $ = new GetTargetGroupStickiness();
        }

        public Builder(GetTargetGroupStickiness defaults) {
            $ = new GetTargetGroupStickiness(Objects.requireNonNull(defaults));
        }

        public Builder cookieDuration(Integer cookieDuration) {
            $.cookieDuration = cookieDuration;
            return this;
        }

        public Builder cookieName(String cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetTargetGroupStickiness build() {
            $.cookieDuration = Objects.requireNonNull($.cookieDuration, "expected parameter 'cookieDuration' to be non-null");
            $.cookieName = Objects.requireNonNull($.cookieName, "expected parameter 'cookieName' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
