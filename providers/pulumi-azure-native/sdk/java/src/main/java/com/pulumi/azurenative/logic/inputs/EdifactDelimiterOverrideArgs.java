// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.EdifactDecimalIndicator;
import com.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact delimiter override settings.
 * 
 */
public final class EdifactDelimiterOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactDelimiterOverrideArgs Empty = new EdifactDelimiterOverrideArgs();

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
    private Output<Integer> componentSeparator;

    public Output<Integer> componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
    private Output<Integer> dataElementSeparator;

    public Output<Integer> dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The decimal point indicator.
     * 
     */
    @Import(name="decimalPointIndicator", required=true)
    private Output<EdifactDecimalIndicator> decimalPointIndicator;

    public Output<EdifactDecimalIndicator> decimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The message association assigned code.
     * 
     */
    @Import(name="messageAssociationAssignedCode")
    private @Nullable Output<String> messageAssociationAssignedCode;

    public Optional<Output<String>> messageAssociationAssignedCode() {
        return Optional.ofNullable(this.messageAssociationAssignedCode);
    }

    /**
     * The message id.
     * 
     */
    @Import(name="messageId")
    private @Nullable Output<String> messageId;

    public Optional<Output<String>> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * The message release.
     * 
     */
    @Import(name="messageRelease")
    private @Nullable Output<String> messageRelease;

    public Optional<Output<String>> messageRelease() {
        return Optional.ofNullable(this.messageRelease);
    }

    /**
     * The message version.
     * 
     */
    @Import(name="messageVersion")
    private @Nullable Output<String> messageVersion;

    public Optional<Output<String>> messageVersion() {
        return Optional.ofNullable(this.messageVersion);
    }

    /**
     * The release indicator.
     * 
     */
    @Import(name="releaseIndicator", required=true)
    private Output<Integer> releaseIndicator;

    public Output<Integer> releaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @Import(name="repetitionSeparator", required=true)
    private Output<Integer> repetitionSeparator;

    public Output<Integer> repetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
    private Output<Integer> segmentTerminator;

    public Output<Integer> segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
    private Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Output<SegmentTerminatorSuffix> segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    @Import(name="targetNamespace")
    private @Nullable Output<String> targetNamespace;

    public Optional<Output<String>> targetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    private EdifactDelimiterOverrideArgs() {}

    private EdifactDelimiterOverrideArgs(EdifactDelimiterOverrideArgs $) {
        this.componentSeparator = $.componentSeparator;
        this.dataElementSeparator = $.dataElementSeparator;
        this.decimalPointIndicator = $.decimalPointIndicator;
        this.messageAssociationAssignedCode = $.messageAssociationAssignedCode;
        this.messageId = $.messageId;
        this.messageRelease = $.messageRelease;
        this.messageVersion = $.messageVersion;
        this.releaseIndicator = $.releaseIndicator;
        this.repetitionSeparator = $.repetitionSeparator;
        this.segmentTerminator = $.segmentTerminator;
        this.segmentTerminatorSuffix = $.segmentTerminatorSuffix;
        this.targetNamespace = $.targetNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactDelimiterOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactDelimiterOverrideArgs $;

        public Builder() {
            $ = new EdifactDelimiterOverrideArgs();
        }

        public Builder(EdifactDelimiterOverrideArgs defaults) {
            $ = new EdifactDelimiterOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder componentSeparator(Output<Integer> componentSeparator) {
            $.componentSeparator = componentSeparator;
            return this;
        }

        public Builder componentSeparator(Integer componentSeparator) {
            return componentSeparator(Output.of(componentSeparator));
        }

        public Builder dataElementSeparator(Output<Integer> dataElementSeparator) {
            $.dataElementSeparator = dataElementSeparator;
            return this;
        }

        public Builder dataElementSeparator(Integer dataElementSeparator) {
            return dataElementSeparator(Output.of(dataElementSeparator));
        }

        public Builder decimalPointIndicator(Output<EdifactDecimalIndicator> decimalPointIndicator) {
            $.decimalPointIndicator = decimalPointIndicator;
            return this;
        }

        public Builder decimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
            return decimalPointIndicator(Output.of(decimalPointIndicator));
        }

        public Builder messageAssociationAssignedCode(@Nullable Output<String> messageAssociationAssignedCode) {
            $.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder messageAssociationAssignedCode(String messageAssociationAssignedCode) {
            return messageAssociationAssignedCode(Output.of(messageAssociationAssignedCode));
        }

        public Builder messageId(@Nullable Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        public Builder messageRelease(@Nullable Output<String> messageRelease) {
            $.messageRelease = messageRelease;
            return this;
        }

        public Builder messageRelease(String messageRelease) {
            return messageRelease(Output.of(messageRelease));
        }

        public Builder messageVersion(@Nullable Output<String> messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        public Builder messageVersion(String messageVersion) {
            return messageVersion(Output.of(messageVersion));
        }

        public Builder releaseIndicator(Output<Integer> releaseIndicator) {
            $.releaseIndicator = releaseIndicator;
            return this;
        }

        public Builder releaseIndicator(Integer releaseIndicator) {
            return releaseIndicator(Output.of(releaseIndicator));
        }

        public Builder repetitionSeparator(Output<Integer> repetitionSeparator) {
            $.repetitionSeparator = repetitionSeparator;
            return this;
        }

        public Builder repetitionSeparator(Integer repetitionSeparator) {
            return repetitionSeparator(Output.of(repetitionSeparator));
        }

        public Builder segmentTerminator(Output<Integer> segmentTerminator) {
            $.segmentTerminator = segmentTerminator;
            return this;
        }

        public Builder segmentTerminator(Integer segmentTerminator) {
            return segmentTerminator(Output.of(segmentTerminator));
        }

        public Builder segmentTerminatorSuffix(Output<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            $.segmentTerminatorSuffix = segmentTerminatorSuffix;
            return this;
        }

        public Builder segmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            return segmentTerminatorSuffix(Output.of(segmentTerminatorSuffix));
        }

        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        public EdifactDelimiterOverrideArgs build() {
            $.componentSeparator = Objects.requireNonNull($.componentSeparator, "expected parameter 'componentSeparator' to be non-null");
            $.dataElementSeparator = Objects.requireNonNull($.dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
            $.decimalPointIndicator = Objects.requireNonNull($.decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
            $.releaseIndicator = Objects.requireNonNull($.releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
            $.repetitionSeparator = Objects.requireNonNull($.repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
            $.segmentTerminator = Objects.requireNonNull($.segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
            $.segmentTerminatorSuffix = Objects.requireNonNull($.segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
            return $;
        }
    }

}
