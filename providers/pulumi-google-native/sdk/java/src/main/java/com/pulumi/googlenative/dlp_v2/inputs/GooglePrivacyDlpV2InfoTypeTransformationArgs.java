// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrimitiveTransformationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A transformation to apply to text that is identified as a specific info_type.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InfoTypeTransformationArgs Empty = new GooglePrivacyDlpV2InfoTypeTransformationArgs();

    /**
     * InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`.
     * 
     */
    @Import(name="infoTypes")
    private @Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;

    public Optional<Output<List<GooglePrivacyDlpV2InfoTypeArgs>>> infoTypes() {
        return Optional.ofNullable(this.infoTypes);
    }

    /**
     * Primitive transformation to apply to the infoType.
     * 
     */
    @Import(name="primitiveTransformation", required=true)
    private Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation;

    public Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation() {
        return this.primitiveTransformation;
    }

    private GooglePrivacyDlpV2InfoTypeTransformationArgs() {}

    private GooglePrivacyDlpV2InfoTypeTransformationArgs(GooglePrivacyDlpV2InfoTypeTransformationArgs $) {
        this.infoTypes = $.infoTypes;
        this.primitiveTransformation = $.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InfoTypeTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeTransformationArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InfoTypeTransformationArgs();
        }

        public Builder(GooglePrivacyDlpV2InfoTypeTransformationArgs defaults) {
            $ = new GooglePrivacyDlpV2InfoTypeTransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder infoTypes(@Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes) {
            $.infoTypes = infoTypes;
            return this;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeArgs> infoTypes) {
            return infoTypes(Output.of(infoTypes));
        }

        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }

        public Builder primitiveTransformation(Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation) {
            $.primitiveTransformation = primitiveTransformation;
            return this;
        }

        public Builder primitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationArgs primitiveTransformation) {
            return primitiveTransformation(Output.of(primitiveTransformation));
        }

        public GooglePrivacyDlpV2InfoTypeTransformationArgs build() {
            $.primitiveTransformation = Objects.requireNonNull($.primitiveTransformation, "expected parameter 'primitiveTransformation' to be non-null");
            return $;
        }
    }

}
