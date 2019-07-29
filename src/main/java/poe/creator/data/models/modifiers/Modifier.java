package poe.creator.data.models.modifiers;

import java.util.List;

public abstract class Modifier {

    private String template;
    private List<ModifierData> modifierData;

    public Modifier(String template, List<ModifierData> modifierData) {
        this.template = template;
        this.modifierData = modifierData;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<ModifierData> getModifierData() {
        return modifierData;
    }

    public void setModifierData(List<ModifierData> modifierData) {
        this.modifierData = modifierData;
    }

    public class ModifierData {
        private String relatesTo;
        private List<LocalRange> range;
        private String measure;

        public ModifierData() {
        }

        public ModifierData(String relatesTo, List<LocalRange> range, String measure) {
            this.relatesTo = relatesTo;
            this.range = range;
            this.measure = measure;
        }

        public String getRelatesTo() {
            return relatesTo;
        }

        public void setRelatesTo(String relatesTo) {
            this.relatesTo = relatesTo;
        }

        public List<LocalRange> getRange() {
            return range;
        }

        public void setRange(List<LocalRange> range) {
            this.range = range;
        }

        public String getMeasure() {
            return measure;
        }

        public void setMeasure(String measure) {
            this.measure = measure;
        }

        class LocalRange {
            private Integer currentValue;
            private Integer minLimit;
            private Integer maxLimit;

            public LocalRange() {
            }

            public LocalRange(Integer currentValue, Integer minLimit, Integer maxLimit) {
                this.currentValue = currentValue;
                this.minLimit = minLimit;
                this.maxLimit = maxLimit;
            }

            public Integer getCurrentValue() {
                return currentValue;
            }

            public void setCurrentValue(Integer currentValue) {
                this.currentValue = currentValue;
            }

            public Integer getMinLimit() {
                return minLimit;
            }

            public void setMinLimit(Integer minLimit) {
                this.minLimit = minLimit;
            }

            public Integer getMaxLimit() {
                return maxLimit;
            }

            public void setMaxLimit(Integer maxLimit) {
                this.maxLimit = maxLimit;
            }
        }
    }
}
