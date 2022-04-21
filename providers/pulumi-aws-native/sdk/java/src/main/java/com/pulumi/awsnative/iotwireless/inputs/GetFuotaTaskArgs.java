// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFuotaTaskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFuotaTaskArgs Empty = new GetFuotaTaskArgs();

    /**
     * FUOTA task id. Returned after successful create.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetFuotaTaskArgs() {}

    private GetFuotaTaskArgs(GetFuotaTaskArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFuotaTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFuotaTaskArgs $;

        public Builder() {
            $ = new GetFuotaTaskArgs();
        }

        public Builder(GetFuotaTaskArgs defaults) {
            $ = new GetFuotaTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetFuotaTaskArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
