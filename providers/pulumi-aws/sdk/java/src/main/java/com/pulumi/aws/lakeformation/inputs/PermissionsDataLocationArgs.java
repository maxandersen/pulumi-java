// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsDataLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsDataLocationArgs Empty = new PermissionsDataLocationArgs();

    /**
     * Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    private PermissionsDataLocationArgs() {}

    private PermissionsDataLocationArgs(PermissionsDataLocationArgs $) {
        this.arn = $.arn;
        this.catalogId = $.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsDataLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsDataLocationArgs $;

        public Builder() {
            $ = new PermissionsDataLocationArgs();
        }

        public Builder(PermissionsDataLocationArgs defaults) {
            $ = new PermissionsDataLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public PermissionsDataLocationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
