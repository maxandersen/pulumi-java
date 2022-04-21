// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs();

    /**
     * Characters to not transform when masking.
     * 
     */
    @Import(name="charactersToSkip")
    private @Nullable Output<String> charactersToSkip;

    public Optional<Output<String>> charactersToSkip() {
        return Optional.ofNullable(this.charactersToSkip);
    }

    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
     */
    @Import(name="commonCharactersToIgnore")
    private @Nullable Output<String> commonCharactersToIgnore;

    public Optional<Output<String>> commonCharactersToIgnore() {
        return Optional.ofNullable(this.commonCharactersToIgnore);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs $) {
        this.charactersToSkip = $.charactersToSkip;
        this.commonCharactersToIgnore = $.commonCharactersToIgnore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder charactersToSkip(@Nullable Output<String> charactersToSkip) {
            $.charactersToSkip = charactersToSkip;
            return this;
        }

        public Builder charactersToSkip(String charactersToSkip) {
            return charactersToSkip(Output.of(charactersToSkip));
        }

        public Builder commonCharactersToIgnore(@Nullable Output<String> commonCharactersToIgnore) {
            $.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }

        public Builder commonCharactersToIgnore(String commonCharactersToIgnore) {
            return commonCharactersToIgnore(Output.of(commonCharactersToIgnore));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs build() {
            return $;
        }
    }

}
