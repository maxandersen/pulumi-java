// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSigningProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSigningProfileArgs Empty = new GetSigningProfileArgs();

    /**
     * The name of the target signing profile.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * A list of tags associated with the signing profile.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSigningProfileArgs() {}

    private GetSigningProfileArgs(GetSigningProfileArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSigningProfileArgs $;

        public Builder() {
            $ = new GetSigningProfileArgs();
        }

        public Builder(GetSigningProfileArgs defaults) {
            $ = new GetSigningProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetSigningProfileArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
