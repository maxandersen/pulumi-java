// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudtrail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrailArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrailArgs Empty = new GetTrailArgs();

    @Import(name="trailName", required=true)
    private String trailName;

    public String trailName() {
        return this.trailName;
    }

    private GetTrailArgs() {}

    private GetTrailArgs(GetTrailArgs $) {
        this.trailName = $.trailName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrailArgs $;

        public Builder() {
            $ = new GetTrailArgs();
        }

        public Builder(GetTrailArgs defaults) {
            $ = new GetTrailArgs(Objects.requireNonNull(defaults));
        }

        public Builder trailName(String trailName) {
            $.trailName = trailName;
            return this;
        }

        public GetTrailArgs build() {
            $.trailName = Objects.requireNonNull($.trailName, "expected parameter 'trailName' to be non-null");
            return $;
        }
    }

}
