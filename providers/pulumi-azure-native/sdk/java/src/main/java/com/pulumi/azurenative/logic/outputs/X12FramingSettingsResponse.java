// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class X12FramingSettingsResponse {
    /**
     * @return The X12 character set.
     * 
     */
    private final String characterSet;
    /**
     * @return The component separator.
     * 
     */
    private final Integer componentSeparator;
    /**
     * @return The data element separator.
     * 
     */
    private final Integer dataElementSeparator;
    /**
     * @return The replacement character.
     * 
     */
    private final Integer replaceCharacter;
    /**
     * @return The value indicating whether to replace separators in payload.
     * 
     */
    private final Boolean replaceSeparatorsInPayload;
    /**
     * @return The segment terminator.
     * 
     */
    private final Integer segmentTerminator;
    /**
     * @return The segment terminator suffix.
     * 
     */
    private final String segmentTerminatorSuffix;

    @CustomType.Constructor
    private X12FramingSettingsResponse(
        @CustomType.Parameter("characterSet") String characterSet,
        @CustomType.Parameter("componentSeparator") Integer componentSeparator,
        @CustomType.Parameter("dataElementSeparator") Integer dataElementSeparator,
        @CustomType.Parameter("replaceCharacter") Integer replaceCharacter,
        @CustomType.Parameter("replaceSeparatorsInPayload") Boolean replaceSeparatorsInPayload,
        @CustomType.Parameter("segmentTerminator") Integer segmentTerminator,
        @CustomType.Parameter("segmentTerminatorSuffix") String segmentTerminatorSuffix) {
        this.characterSet = characterSet;
        this.componentSeparator = componentSeparator;
        this.dataElementSeparator = dataElementSeparator;
        this.replaceCharacter = replaceCharacter;
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        this.segmentTerminator = segmentTerminator;
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
    }

    /**
     * @return The X12 character set.
     * 
     */
    public String characterSet() {
        return this.characterSet;
    }
    /**
     * @return The component separator.
     * 
     */
    public Integer componentSeparator() {
        return this.componentSeparator;
    }
    /**
     * @return The data element separator.
     * 
     */
    public Integer dataElementSeparator() {
        return this.dataElementSeparator;
    }
    /**
     * @return The replacement character.
     * 
     */
    public Integer replaceCharacter() {
        return this.replaceCharacter;
    }
    /**
     * @return The value indicating whether to replace separators in payload.
     * 
     */
    public Boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }
    /**
     * @return The segment terminator.
     * 
     */
    public Integer segmentTerminator() {
        return this.segmentTerminator;
    }
    /**
     * @return The segment terminator suffix.
     * 
     */
    public String segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12FramingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String characterSet;
        private Integer componentSeparator;
        private Integer dataElementSeparator;
        private Integer replaceCharacter;
        private Boolean replaceSeparatorsInPayload;
        private Integer segmentTerminator;
        private String segmentTerminatorSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(X12FramingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterSet = defaults.characterSet;
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.replaceCharacter = defaults.replaceCharacter;
    	      this.replaceSeparatorsInPayload = defaults.replaceSeparatorsInPayload;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
        }

        public Builder characterSet(String characterSet) {
            this.characterSet = Objects.requireNonNull(characterSet);
            return this;
        }
        public Builder componentSeparator(Integer componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }
        public Builder dataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }
        public Builder replaceCharacter(Integer replaceCharacter) {
            this.replaceCharacter = Objects.requireNonNull(replaceCharacter);
            return this;
        }
        public Builder replaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload);
            return this;
        }
        public Builder segmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }
        public Builder segmentTerminatorSuffix(String segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }        public X12FramingSettingsResponse build() {
            return new X12FramingSettingsResponse(characterSet, componentSeparator, dataElementSeparator, replaceCharacter, replaceSeparatorsInPayload, segmentTerminator, segmentTerminatorSuffix);
        }
    }
}
