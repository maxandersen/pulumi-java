// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.IPSetScope;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPSetArgs Empty = new GetIPSetArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="scope", required=true)
    private IPSetScope scope;

    public IPSetScope scope() {
        return this.scope;
    }

    private GetIPSetArgs() {}

    private GetIPSetArgs(GetIPSetArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPSetArgs $;

        public Builder() {
            $ = new GetIPSetArgs();
        }

        public Builder(GetIPSetArgs defaults) {
            $ = new GetIPSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder scope(IPSetScope scope) {
            $.scope = scope;
            return this;
        }

        public GetIPSetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
