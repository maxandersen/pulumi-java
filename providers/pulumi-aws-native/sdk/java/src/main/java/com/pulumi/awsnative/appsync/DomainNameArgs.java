// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appsync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainNameArgs Empty = new DomainNameArgs();

    @Import(name="certificateArn", required=true)
    private Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn;
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    private DomainNameArgs() {}

    private DomainNameArgs(DomainNameArgs $) {
        this.certificateArn = $.certificateArn;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNameArgs $;

        public Builder() {
            $ = new DomainNameArgs();
        }

        public Builder(DomainNameArgs defaults) {
            $ = new DomainNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateArn(Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public DomainNameArgs build() {
            $.certificateArn = Objects.requireNonNull($.certificateArn, "expected parameter 'certificateArn' to be non-null");
            return $;
        }
    }

}
