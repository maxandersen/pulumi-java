// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMissionProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMissionProfileArgs Empty = new GetMissionProfileArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetMissionProfileArgs() {}

    private GetMissionProfileArgs(GetMissionProfileArgs $) {
        this.arn = $.arn;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMissionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMissionProfileArgs $;

        public Builder() {
            $ = new GetMissionProfileArgs();
        }

        public Builder(GetMissionProfileArgs defaults) {
            $ = new GetMissionProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetMissionProfileArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
